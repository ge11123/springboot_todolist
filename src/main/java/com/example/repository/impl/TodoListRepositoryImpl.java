package com.example.repository.impl;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.Statement;

import com.example.entity.TodoItem;
import com.example.repository.TodoListRepository;

@Component
public class TodoListRepositoryImpl implements TodoListRepository {

    public List<TodoItem> getTodoItems() {
        String url = "jdbc:mysql://localhost/ExampleDB";
        String username = "root";
        String password = "P@55word";

        try (Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement()) {

            String sql = "SELECT * FROM todolist";
            ResultSet resultSet = statement.executeQuery(sql);

            List<TodoItem> todoItems = new ArrayList<>();
            while (resultSet.next()) {
                TodoItem item = new TodoItem();
                item.id = resultSet.getInt("id");
                item.title = resultSet.getString("title");
                item.description = resultSet.getString("description");
                item.completed = resultSet.getBoolean("completed");
                todoItems.add(item);
            }
            return todoItems;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}