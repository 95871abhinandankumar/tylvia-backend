package com.tylvia.service;
import com.tylvia.model.Conversation;
import com.tylvia.repository.ConversationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;

import java.util.List;

@Service
public class ConversationService {
    private final ConversationRepository conversationRepository;

    @Autowired
    public ConversationService(ConversationRepository conversationRepository) {
        this.conversationRepository = conversationRepository;
    }

    public Conversation getConversationById(String id) {
        return conversationRepository.findById(id).orElse(null);
    }

    public List<Conversation> getAllConversations() {
        List<Conversation> conversations = conversationRepository.findAll();
        System.out.println("Conversations: " + conversations);
        return conversations;
    }

    public List<Conversation> getConversationsByUserId(String userId) {
        return conversationRepository.findByParticipants(userId);
    }
}