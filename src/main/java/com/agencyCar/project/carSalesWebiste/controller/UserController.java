package com.agencyCar.project.carSalesWebiste.controller;

import com.agencyCar.project.carSalesWebiste.dto.UserDto;
import com.agencyCar.project.carSalesWebiste.model.User;
import com.agencyCar.project.carSalesWebiste.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return null;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDto userDto){
        return null;
    }
}
