package com.example.todolistapi;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TodoListController {
    @GetMapping("/todolist")
    public String get() {
        return "Hello world";
    }

}
