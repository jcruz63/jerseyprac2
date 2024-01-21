package com.turnbased.jerseyprac2.resources.message;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("messages")
public class MessageResource {


    MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages(){
        return messageService.getMessages();
    }

    @GET
    @Path("{messageID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage(@PathParam("messageID") long messageID){
        return messageService.getMessage(messageID);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message createMessage(Message message){
        return messageService.createMessage(message);
    }
}
