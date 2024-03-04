package com.example.service;

import java.util.List;

import com.example.entity.TodoItem;


public interface TodoListService {
    List<TodoItem> getUnCompletedTodoLists();
}
