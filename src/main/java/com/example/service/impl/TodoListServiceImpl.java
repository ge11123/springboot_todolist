package com.example.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.entity.TodoItem;
import com.example.repository.TodoListRepository;
import com.example.service.TodoListService;

@Component
public class TodoListServiceImpl implements TodoListService {

    private final TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    public List<TodoItem> getUnCompletedTodoLists() {

        List<TodoItem> todoItems = todoListRepository.getTodoItems();

        return todoItems;
    }
}
