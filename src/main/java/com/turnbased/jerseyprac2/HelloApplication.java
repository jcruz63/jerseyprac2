package com.turnbased.jerseyprac2;

import com.turnbased.jerseyprac2.persistence.LocalPersistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;

@ApplicationPath("/api")
public class HelloApplication extends Application {
    static {
        System.out.println(System.getenv("dbUsername"));
        Map<String, String> props = new HashMap<>();
        props.put("hibernate.show_sql", "true");
        EntityManagerFactory entityManagerFactory = new HibernatePersistenceProvider().createContainerEntityManagerFactory(new LocalPersistence(), props);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();

            entityManager.getTransaction().commit();
        }finally {
            entityManager.close();
        }
    }
}