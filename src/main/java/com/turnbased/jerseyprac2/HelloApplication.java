package com.turnbased.jerseyprac2;

import com.turnbased.jerseyprac2.model.Category;
import com.turnbased.jerseyprac2.service.CategoryService;
import jakarta.persistence.TypedQuery;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.logging.Logger;

@ApplicationPath("/api")
public class HelloApplication extends Application {

    static {

        Logger logger = Logger.getLogger(HelloApplication.class.getName());
//        try {
//            entityManager.getTransaction().begin();

//            Category category = new Category();
//            category.setTitle("Property");
//            category.setHexColor("#eb4034");
//            category.setShortDescription("This is the short description");
//            category.setLongDescription("This is the long description");
//            entityManager.persist(category);
//            logger.info(category.toString());
//            Dataset dataset = new Dataset();
//            dataset.setCategory(category);
//            dataset.setDescription("This is my first dataset");
//            dataset.setName("Loan");
//
//            entityManager.persist(dataset);
//            logger.info(dataset.toString());
//            JoinKey joinKey = new JoinKey();
//            joinKey.setValue("Geo-Location");
//            entityManager.persist(joinKey);
//            logger.info(joinKey.toString());
//            JoinValue joinValue = new JoinValue();
//            joinValue.setJoinKey(joinKey);
//            joinValue.setValue("State");
//            entityManager.persist(joinValue);
//            logger.info(joinValue.toString());
//
//
//
//            entityManager.getTransaction().commit();
//
//        }finally {
//            entityManager.close();
//        }

//        CategoryService categoryService = new CategoryService();
//        Category category = categoryService.getCategoryById(1);
//        logger.info(category.toString());


    }
}