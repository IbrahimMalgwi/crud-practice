package com.ganzymalgwi.crudoperations.controller;

import com.ganzymalgwi.crudoperations.data.dto.request.RegistrationRequest;
import com.ganzymalgwi.crudoperations.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> createUser (@RequestBody RegistrationRequest registrationRequest){
        return new ResponseEntity<>(userService.createUser(registrationRequest), HttpStatus.OK);
    }

    @GetMapping("/user/{email}")
    public ResponseEntity<?> getUserByEmail(@PathVariable String email){
        return new ResponseEntity<>(userService.findByEmail(email), HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id){
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }


}
