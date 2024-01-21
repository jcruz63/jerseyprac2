package com.turnbased.jerseyprac2.resources.message;

import java.util.ArrayList;
import java.util.List;

public class MessageService {

    public List<Message> getMessages(){
        Message m1 = new Message(1L, "First Message", "Jonathan Cruz");
        Message m2 = new Message(2L, "Second Message", "Jonathan Cruz");
        List<Message> messages = new ArrayList<>();
        messages.add(m1);
        messages.add(m2);
        return messages;
    }

    public Message getMessage(long id){
        return new Message(id, "Third Message", "Jonathan");
    }

    public Message createMessage(Message message){
        return message;
    }
}
