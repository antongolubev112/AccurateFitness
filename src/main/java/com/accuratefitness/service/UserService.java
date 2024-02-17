package com.accuratefitness.service;

import com.accuratefitness.persistance.model.User;
import com.accuratefitness.persistance.repo.UserRepo;
import com.accuratefitness.service.security.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class UserService {
    private UserRepo userRepo;
    private JwtService jwtService;

    // Obtain a logger instance for the current class
    private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());

    @Autowired
    public UserService(UserRepo userRepo, JwtService jwtService) {
        this.userRepo = userRepo;
        this.jwtService = jwtService;
    }

    public User register(User user) {
        // You can add validation logic here
        if(userRepo.findByEmail(user.getEmail()) != null) {
            throw new RuntimeException("Email already exists");
        }
        // Save the user
        return userRepo.save(user);
    }

    public String login(String email, String password) {
        LOGGER.info("Login attempt for user with email: " + email + " and password: " + password);
        User user = userRepo.findByEmailAndPassword(email, password);
        LOGGER.info("User found: " + user.getName());
        if (user != null) {
            return jwtService.generateToken(email);
        } else {
            return null;
        }
    }
}
