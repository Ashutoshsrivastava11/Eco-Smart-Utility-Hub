package com.smartutility.controller;

import com.smartutility.model.User;
import com.smartutility.service.UserService;
import java.util.List;

/**
 * REST Controller for managing users.
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Registers a new user.
     *
     * @param userDTO Data Transfer Object representing the user.
     * @return User entity that was created.
     */
    @PostMapping("/register")
    public User registerUser(@RequestBody UserDTO userDTO) {
        return userService.registerUser(userDTO);
    }

    /**
     * Retrieves all users.
     *
     * @return List of all users.
     */
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * Deletes a user by ID.
     *
     * @param userId ID of the user to be deleted.
     */
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
    }
}
