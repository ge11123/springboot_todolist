package com.example.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
public class ErrorController {
    @GetMapping("/")
    public ResponseEntity<String> get() {
        String errorMessage = "error, 請輸入正確的url";
        return ResponseEntity.status(HttpStatus.OK).body(errorMessage);
    }

}
