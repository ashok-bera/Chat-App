package com.chat.app.controller;

import com.chat.app.mode.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    /* when user send the message at sendMessage our application should accept and send it to
    all the user who subscribed to topic chatroom
    */
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }

    // when user visits 8080/chat it should get this thymeleaf template
    @GetMapping("chat")
    public String chat(){
        return "chat";
    }

}
