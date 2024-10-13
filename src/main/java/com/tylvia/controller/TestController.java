package com.tylvia.controller;

import com.tylvia.model.User;
import com.tylvia.service.ConversationService;
import com.tylvia.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tylvia.service.UserService;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    private final UserService userService;
    private final MessageService messageService;
    private final ConversationService conversationService;

    public TestController(UserService userService, MessageService messageService, ConversationService conversationService) {
        this.userService = userService;
        this.messageService = messageService;
        this.conversationService = conversationService;
    }

    @GetMapping("/test")
    public ResponseEntity<Map<String, List<?>>> testConnection() {
//        User testUser = new User();
//        testUser.setId("testId");
//        testUser.setUsername("Test User");
//        testUser.setEmail("testuser@example.com");
//        testUser.setPhone("123-456-7890");
//        testUser.setProfileImageUrl("http://example.com/profile.jpg");
//        testUser.setStatusMessage("Hello World!");
//        testUser.setLastSeen(LocalDateTime.now());
//        testUser.setCreatedAt(LocalDateTime.now());
//        testUser.setUpdatedAt(LocalDateTime.now());
//        this.userService.createUser(testUser);

        Map<String, List<?>> map = new HashMap<>();
        System.out.println(this.messageService.getAllMessages());
        System.out.println(this.conversationService.getAllConversations());
        System.out.println(this.userService.getAllUsers());
        map.put("users" , this.userService.getAllUsers());
        map.put("messages" , this.messageService.getAllMessages());
        map.put("conversations" , this.conversationService.getAllConversations());



        return ResponseEntity.ok(map);
    }
}