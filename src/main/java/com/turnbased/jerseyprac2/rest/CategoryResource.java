package com.turnbased.jerseyprac2.rest;

import com.turnbased.jerseyprac2.model.Category;
import com.turnbased.jerseyprac2.service.CategoryService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/categories")
public class CategoryResource {

    CategoryService categoryService = new CategoryService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Category> getAllCategories(){
        return categoryService.getCategories();
    }
}
