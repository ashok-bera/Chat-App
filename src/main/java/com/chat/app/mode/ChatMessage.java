package com.chat.app.mode;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatMessage {
    private long id;
    private String sender;
    private String content;
}
