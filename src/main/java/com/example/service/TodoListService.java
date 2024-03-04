package com.example.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.entity.TodoItem;
import com.example.repository.TodoListRepository;

@Component
public class TodoListService {

    private final TodoListRepository todoListRepository;

    public TodoListService(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    public List<TodoItem> getUnCompletedTodoLists() {

        List<TodoItem> todoItems = todoListRepository.getTodoItems();

        return todoItems;
    }
}
