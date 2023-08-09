package com.example.ticketmanagementsystem;

public class ModelClass {

    String title;
    String description;
    boolean expanded;

    public ModelClass(String title, String description, boolean isVisible) {
        this.title = title;
        this.description = description;
        this.expanded = isVisible;
    }

    public ModelClass(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }
}
