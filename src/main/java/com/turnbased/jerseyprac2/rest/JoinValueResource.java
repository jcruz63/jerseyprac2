package com.turnbased.jerseyprac2.rest;

import com.turnbased.jerseyprac2.model.JoinValue;
import com.turnbased.jerseyprac2.service.JoinValueService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.Optional;

@Path("joinvalues")
@Produces(MediaType.APPLICATION_JSON)
public class JoinValueResource {

    JoinValueService joinValueService = new JoinValueService();

    @GET
    public List<JoinValue> getJoinvalues(@QueryParam("value") Optional<String> value, @QueryParam("joinkeyid") Optional<Long> id){
        if(value.isPresent()){
            return List.of(joinValueService.getJoinvalueByValue(value.get()));
        }
        if(id.isPresent()){
            return joinValueService.getJoinvaluesByJoinkeyID(id.get());
        }
        return joinValueService.getJoinvalues();
    }

    @GET
    @Path("{id}")
    public JoinValue getJoinValueById(@PathParam("id") long id) {
        return joinValueService.getJoinvalueById(id);
    }



}
