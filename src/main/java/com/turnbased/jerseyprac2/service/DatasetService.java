package com.turnbased.jerseyprac2.service;

import com.turnbased.jerseyprac2.model.Dataset;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class DatasetService extends ServiceBase{

    private final EntityManager entityManager;

    public DatasetService(){
        entityManager = entityManagerFactory.createEntityManager();
    }

    public List<Dataset> getAllDatasets(){
        TypedQuery<Dataset> query = entityManager.createQuery("select d from Dataset d", Dataset.class);
        return query.getResultList();
    }

    public Long getDatasetID(){
        String jpql = """
                    select c.id from Category c
                """;
        TypedQuery<Long> q = entityManager.createQuery(jpql, Long.class);
        return q.getSingleResult();
    }
}
