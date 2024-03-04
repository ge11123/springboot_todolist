package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.model.TodoList;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class TodoListController {
    @GetMapping("/todolist")
    public ResponseEntity<List<TodoList>> getTodoList() {
        List<TodoList> todoLists = new ArrayList<>();
        todoLists.add(new TodoList(1, "讀書", false));
        todoLists.add(new TodoList(2, "運動", true));
        todoLists.add(new TodoList(3, "寫程式", false));
        todoLists.add(new TodoList(4, "做家務", true));
        todoLists.add(new TodoList(5, "看電影", false));

        return ResponseEntity.status(HttpStatus.OK).body(todoLists);
    }
}
