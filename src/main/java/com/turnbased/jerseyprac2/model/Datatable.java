package com.turnbased.jerseyprac2.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Datatable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String displayName;
    private int rowCount;
    private Date created;
    private Date lastUpdated;
    private boolean showExplorer;
    private boolean showGallery;
    private String name;
    private String description;
    private int catalogOrder;
    @ManyToOne
    private Provider providerID;
    @ManyToOne
    private SearchURI searchURI;
    @ManyToOne
    private Dataset datasetID;
    @ManyToOne
    private UpdateFrequency updateFrequencyID;

}
