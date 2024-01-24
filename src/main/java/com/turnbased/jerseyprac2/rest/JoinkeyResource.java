package com.turnbased.jerseyprac2.rest;

import com.turnbased.jerseyprac2.model.JoinKey;
import com.turnbased.jerseyprac2.service.JoinKeyService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("joinkeys")
@Produces(MediaType.APPLICATION_JSON)
public class JoinkeyResource {

    JoinKeyService joinKeyService = new JoinKeyService();

    @GET
    public List<JoinKey> getJoinKeys() {
        return joinKeyService.getJoinkeys();
    }

    @GET
    @Path("{name}")
    public JoinKey getJoinKeyByName(@PathParam("name") String name) {
        return joinKeyService.getJoinkeyByName(name);
    }

    @GET
    @Path("{id}")
    public JoinKey getJoinKeyById(@PathParam("id") Long id) {
        return joinKeyService.getJoinkeyByID(id);
    }
}
