package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.TodoList;

@Component
public class TodoListRepository {

    public List<TodoList> getTodoLists() {
        List<TodoList> todoLists = new ArrayList<>();
        todoLists.add(new TodoList(1, "讀書", false));
        todoLists.add(new TodoList(2, "運動", true));
        todoLists.add(new TodoList(3, "寫程式", false));
        todoLists.add(new TodoList(4, "做家務", true));
        todoLists.add(new TodoList(5, "看電影", false));

        return todoLists;
    }
}