package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.model.TodoList;
import com.example.repository.TodoListRepository;

public class TodoListService {

    public List<TodoList> getUnCompletedTodoLists() {

        TodoListRepository todoListRepository = new TodoListRepository();

        List<TodoList> allTodoLists = todoListRepository.getTodoLists();

        List<TodoList> uncompletedTodoLists = allTodoLists.stream()
                .filter(todoList -> !todoList.isCompleted())
                .collect(Collectors.toList());

        return uncompletedTodoLists;
    }
}
