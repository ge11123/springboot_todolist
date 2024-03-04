package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.model.TodoList;
import com.example.repository.TodoListRepository;

@Component
public class TodoListService {
    private final TodoListRepository todoListRepository;

    public TodoListService(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    public List<TodoList> getUnCompletedTodoLists() {

        List<TodoList> allTodoLists = todoListRepository.getTodoLists();

        List<TodoList> uncompletedTodoLists = allTodoLists.stream()
                .filter(todoList -> !todoList.isCompleted())
                .collect(Collectors.toList());

        return uncompletedTodoLists;
    }
}
