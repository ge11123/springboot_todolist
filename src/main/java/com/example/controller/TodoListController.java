package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.entity.TodoItem;
import com.example.service.TodoListService;
import com.example.service.impl.TodoListServiceImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class TodoListController {

    private final TodoListService todoListService;

    public TodoListController(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @GetMapping("/todolist")
    public ResponseEntity<List<TodoItem>> getTodoList() {

        List<TodoItem> response = todoListService.getUnCompletedTodoLists();

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/todolist")
    public String addTodoList() {
        return "這是post";
    }

    @PutMapping("/todolist")
    public String updateTodoList() {
        return "這是put";
    }

    @DeleteMapping("/todolist")
    public String DeleteTodoList() {
        return "這是delete";
    }

}
