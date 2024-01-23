package com.turnbased.jerseyprac2.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/categories")
public class CategoryResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllCategories(){
        return null;
    }
}
