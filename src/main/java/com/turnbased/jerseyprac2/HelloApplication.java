package com.turnbased.jerseyprac2;

import com.turnbased.jerseyprac2.model.Category;
import com.turnbased.jerseyprac2.model.Dataset;
import com.turnbased.jerseyprac2.persistence.LocalPersistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@ApplicationPath("/api")
public class HelloApplication extends Application {
    static {
        System.out.println(System.getenv("dbUsername"));
        Map<String, String> props = new HashMap<>();
        props.put("hibernate.show_sql", "true");
        EntityManagerFactory entityManagerFactory = new HibernatePersistenceProvider().createContainerEntityManagerFactory(new LocalPersistence(), props);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Logger logger = Logger.getLogger(HelloApplication.class.getName());
        try {
            entityManager.getTransaction().begin();

//            Category category = new Category();
//            category.setTitle("Property");
//            category.setHexColor("#eb4034");
//            category.setShortDescription("This is the short description");
//            category.setLongDescription("This is the long description");
//            entityManager.persist(category);
            Category category = entityManager.find(Category.class, 1);
            logger.info(category.toString());
            Dataset dataset = new Dataset();
            dataset.setCategory(category);
            dataset.setDescription("This is my first dataset");
            dataset.setName("Loan");

            entityManager.persist(dataset);
            logger.info(dataset.toString());



            entityManager.getTransaction().commit();
        }finally {
            entityManager.close();
        }
    }
}