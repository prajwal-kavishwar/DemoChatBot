package com.project.ChatBot.dto;

import lombok.Getter;
import lombok.Setter;

public class MessageResponse {

    @Getter
    private String reply;

    public MessageResponse(String reply) {
        this.reply = reply;
    }
}
