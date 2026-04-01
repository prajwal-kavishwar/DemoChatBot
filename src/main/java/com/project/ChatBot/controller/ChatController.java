package com.project.ChatBot.controller;


import com.project.ChatBot.dto.MessageRequest;
import com.project.ChatBot.dto.MessageResponse;
import com.project.ChatBot.service.ChatService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class ChatController {
    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }
    @PostMapping
    public MessageResponse message(@RequestBody MessageRequest request){
        System.out.println("Received: " + request.getMessage());

        String reply = chatService.getReply(request.getMessage());

        return new MessageResponse(reply);
    }

}
