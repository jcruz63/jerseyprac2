package com.turnbased.jerseyprac2.service;

import com.turnbased.jerseyprac2.model.JoinKey;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class JoinKeyService extends ServiceBase{

    private final EntityManager entityManager;

    public JoinKeyService(){
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public List<JoinKey> getJoinkeys(){
        TypedQuery<JoinKey> q = entityManager.createQuery("SELECT j FROM JoinKey j", JoinKey.class);
        return q.getResultList();
    }

    public JoinKey getJoinkeyByID(Long id){
        return entityManager.find(JoinKey.class, id);
    }

    public JoinKey getJoinkeyByName(String name){
        TypedQuery<JoinKey> q = entityManager.createQuery("SELECT j FROM JoinKey j WHERE j.value = :name", JoinKey.class);
        q.setParameter("name", name);
        return q.getSingleResult();
    }
}
