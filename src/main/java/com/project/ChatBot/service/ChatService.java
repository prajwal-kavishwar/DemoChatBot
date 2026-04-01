package com.project.ChatBot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String message) {
        if (message == null || message.trim().isEmpty()) return "Invalid message";

        switch (message.toLowerCase()) {
            case "hi": return "Hello";

            case "bye": return "Goodbye";


            default: return "Try either Hi or Bye";
        }
    }

}
