package com.example.demo.controller;

import com.example.demo.model.AppUser;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<AppUser>> getAll() {
        List<AppUser> users = userService.getAll();
        return ResponseEntity.ok(users);
    }

    @PostMapping
    public ResponseEntity<AppUser> create(@RequestBody AppUser user) {
        AppUser appUser = userService.save(user);
        return ResponseEntity.ok(appUser);
    }
}
