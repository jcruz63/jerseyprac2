package com.turnbased.jerseyprac2.service;

import com.turnbased.jerseyprac2.persistence.LocalPersistence;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;

public abstract class ServiceBase {

    protected static EntityManagerFactory entityManagerFactory;

    public ServiceBase(){
        Map<String, String> props = new HashMap<>();
        props.put("hibernate.show_sql", "true");
        entityManagerFactory = new HibernatePersistenceProvider().createContainerEntityManagerFactory(new LocalPersistence(), props);
    }

}
