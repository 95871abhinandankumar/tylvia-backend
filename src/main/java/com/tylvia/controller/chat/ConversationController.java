package com.tylvia.controller.chat;

import com.tylvia.model.Conversation;
import com.tylvia.service.ConversationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/conversation")
public class ConversationController {
     private final ConversationService conversationService;

     @Autowired
     public ConversationController(ConversationService conversationService) {
         this.conversationService = conversationService;
     }

     @GetMapping("/{id}")
     public ResponseEntity<Conversation> getConversationById(@PathVariable String id) {
         Conversation conversation = conversationService.getConversationById(id);
         return conversation != null ? ResponseEntity.ok(conversation) : ResponseEntity.notFound().build();
     }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Conversation>> getConversationsByUserId(@PathVariable String userId) {
        List<Conversation> conversations = conversationService.getConversationsByUserId(userId);
        return conversations != null && !conversations.isEmpty() ? ResponseEntity.ok(conversations) : ResponseEntity.notFound().build();
    }

}
