package com.turnbased.jerseyprac2.service;

import com.turnbased.jerseyprac2.model.JoinValue;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class JoinValueService extends ServiceBase {
    private final EntityManager entityManager;

    public JoinValueService(){
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public List<JoinValue> getJoinvalues(){
        TypedQuery<JoinValue> q = entityManager.createQuery("SELECT j from JoinValue j", JoinValue.class);
        return q.getResultList();
    }

    public JoinValue getJoinvalueById(Long id){
        return entityManager.find(JoinValue.class, id);
    }

    public void createJoinValue(JoinValue joinValue) {
        entityManager.getTransaction().begin();
        entityManager.persist(joinValue);
        entityManager.getTransaction().commit();
    }

    public void updateJoinValue(JoinValue joinValue) {
        entityManager.getTransaction().begin();
        entityManager.merge(joinValue);
        entityManager.getTransaction().commit();
    }

    public JoinValue getJoinvalueByValue(String value){
        TypedQuery<JoinValue> q = entityManager.createQuery("SELECT j from JoinValue j WHERE j.value = :value", JoinValue.class);
        q.setParameter("value", value);
        return q.getSingleResult();
    }

    public List<JoinValue> getJoinvaluesByJoinkeyID(Long id){
        TypedQuery<JoinValue> q = entityManager.createQuery("SELECT j from JoinValue j WHERE j.joinKey.id = :id", JoinValue.class);
        q.setParameter("id", id);
        return q.getResultList();
    }
}
