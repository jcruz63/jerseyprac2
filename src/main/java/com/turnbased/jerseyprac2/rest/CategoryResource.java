package com.turnbased.jerseyprac2.rest;

import com.turnbased.jerseyprac2.model.Category;
import com.turnbased.jerseyprac2.service.CategoryService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/categories")
@Produces(MediaType.APPLICATION_JSON)
public class CategoryResource {

    CategoryService categoryService = new CategoryService();

    @GET
    public List<Category> getAllCategories(){
        return categoryService.getCategories();
    }

    @GET
    @Path("{name}")
    public Category getCategoryByName(@PathParam("name") String name){
        return categoryService.getCategoryByName(name);
    }
}
