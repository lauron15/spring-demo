package com.example.demo.service;

import com.example.demo.model.AppUser;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public AppUser save(AppUser user) {
        return repository.save(user);
    }

    public List<AppUser> getAll() {
        return repository.findAll();
    }
}
