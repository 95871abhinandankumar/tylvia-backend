package com.tylvia.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

public class Content {
    private String text;
    private List<String> attachments;

    public Content() {
    }

    public Content(String text, List<String> attachments) {
        this.text = text;
        this.attachments = attachments;
    }

    // getters and setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }
}
