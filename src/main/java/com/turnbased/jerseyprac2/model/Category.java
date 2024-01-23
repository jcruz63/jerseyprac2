package com.turnbased.jerseyprac2.model;

import jakarta.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    @Column(name = "short_description")
    private String shortDescription;
    @Column(name = "long_description")
    private String longDescription;
    @Column(name = "hex_color")
    private String hexColor;
    public Category() {
    }

    public Category(String title, String shortDescription, String longDescription, String hexColor) {
        this.title = title;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.hexColor = hexColor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getHexColor() {
        return hexColor;
    }

    public void setHexColor(String hexColor) {
        this.hexColor = hexColor;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", hexColor='" + hexColor + '\'' +
                '}';
    }
}
