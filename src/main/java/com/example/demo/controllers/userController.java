package com.example.demo.controllers;

import javax.validation.Valid;
import com.example.demo.models.User;
import com.example.demo.repositories.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")


public class userController {

  @Autowired
  userRepository userRepo;

  @GetMapping("/user")
  public List<User> getAllUsers() {
    Sort sortByCreatedAtDesc = new Sort(Direction.DESC, "createdAt");
    return userRepo.findAll(sortByCreatedAtDesc);

  }

  @PostMapping("/user")
  public User createUser(@Valid @RequestBody User newUser) {
    newUser.setProfileCreated(false);
    return userRepo.save(newUser);
  }

  @GetMapping(value="/user/{id}")
  public ResponseEntity<User> getUserById(@PathVariable("id") String id) {
    return userRepo.findById(id)
        .map(newUser -> ResponseEntity.ok().body(newUser))
        .orElse(ResponseEntity.notFound().build());
  }

  @PutMapping(value="/user/{id")
  public ResponseEntity<User> updateUser(@PathVariable("id") String id,
      @Valid @RequestBody User updatedUser) {
    return userRepo.findById(id)
        .map(userData -> {
          userData.setProfileCreated(updatedUser.isProfileCreated());
          User updatedUser1 = userRepo.save(userData);
          return ResponseEntity.ok().body(updatedUser1);
        }).orElse(ResponseEntity.notFound().build());
  }

  @DeleteMapping(value="/user/{id}")
  public ResponseEntity<?> deleteUser(@PathVariable("id") String id) {
    return userRepo.findById(id)
        .map(newUser -> {
          userRepo.deleteById(id);
          return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
  }


}