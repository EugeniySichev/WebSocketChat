package com.example.WebSocketChat.controller;

import com.example.WebSocketChat.storage.UserStorage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.Set;

@RestController
@CrossOrigin
public class UsersController {

    @GetMapping("/registration/{userName}")
    public ResponseEntity<Void> registration(@PathVariable String userName) {
        try {
            System.out.println("handling registraton user request: " + userName);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok().build();
    }

    @GetMapping("/fetchAllUsers")
    public Set<String> fetchAll(){
        return UserStorage.getInstance().getUsers();
    }
}
