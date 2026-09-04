package com.booking.controller;

import com.booking.entity.User;
import com.booking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {
  @Autowired private UserRepository repo;
  
  @GetMapping("/by-email")
  public User byEmail(@RequestParam String email){
    return repo.findByEmail(email).orElse(null);
  }
}