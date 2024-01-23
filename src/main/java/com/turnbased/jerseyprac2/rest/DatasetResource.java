package com.turnbased.jerseyprac2.rest;

import com.turnbased.jerseyprac2.model.Dataset;
import com.turnbased.jerseyprac2.service.DatasetService;
import jakarta.persistence.TypedQuery;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/datasets")
public class DatasetResource {

    DatasetService datasetService = new DatasetService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Dataset> getAllDatasets(){
        return datasetService.getAllDatasets();
    }

    @Path("/test")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Long getDatasetID(){
        return datasetService.getDatasetID();
    }
}
