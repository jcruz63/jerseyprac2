package com.turnbased.jerseyprac2.model;

import jakarta.persistence.*;

@Entity
public class JoinValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String value;
    @ManyToOne
    private JoinKey joinKey;

    public JoinValue() {
    }

    public JoinValue(long id, String value, JoinKey joinKey) {
        this.id = id;
        this.value = value;
        this.joinKey = joinKey;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public JoinKey getJoinKey() {
        return joinKey;
    }

    public void setJoinKey(JoinKey joinKey) {
        this.joinKey = joinKey;
    }

    @Override
    public String toString() {
        return "JoinValue{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", joinKey=" + joinKey +
                '}';
    }
}
