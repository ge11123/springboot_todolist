package com.example.repository;

import java.util.List;

import com.example.entity.TodoItem;

public interface TodoListRepository {
    List<TodoItem> getTodoItems();
}
