package com.example.entity;

import java.time.LocalDate;

public class TodoItem {
    public int id;
    public String title;
    public String description;
    public LocalDate dueDate;
    public boolean completed;

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", completed=" + completed +
                '}';
    }
}

