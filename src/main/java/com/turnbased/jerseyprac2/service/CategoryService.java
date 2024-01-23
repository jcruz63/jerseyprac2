package com.turnbased.jerseyprac2.service;

import com.turnbased.jerseyprac2.model.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class CategoryService extends ServiceBase{

    private final EntityManager entityManager;

    public CategoryService() {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public List<Category> getCategories(){
        TypedQuery<Category> query = entityManager.createQuery("SELECT c FROM Category c", Category.class);
        return query.getResultList();
    }

    public Category getCategoryById(int id){
        TypedQuery<Category> query = entityManager.createQuery("SELECT c FROM Category c WHERE c.id = :id", Category.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public Category getCategoryByName(String name){
        TypedQuery<Category> query = entityManager.createQuery("SELECT c FROM Category c WHERE c.title = :name", Category.class);
        query.setParameter("name", name);
        return query.getSingleResult();
    }

    public void createCategory(String title, String shortDescription, String longDescription, String hexColor){
        Category category = new Category(title, shortDescription, longDescription, hexColor);
        entityManager.getTransaction().begin();
        entityManager.persist(category);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
