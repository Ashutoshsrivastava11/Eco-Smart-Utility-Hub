package com.smartutility.service;

import com.smartutility.dto.UserDTO;
import com.smartutility.model.User;
import com.smartutility.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing users.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Registers a new user.
     *
     * @param userDTO Data Transfer Object representing the user.
     * @return User entity that was created.
     */
    public User registerUser(UserDTO userDTO) {
        User user = new User(userDTO.getName(), userDTO.getEmail(), userDTO.getPassword());
        return userRepository.save(user);
    }

    /**
     * Retrieves all users.
     *
     * @return List of all users.
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Deletes a user by ID.
     *
     * @param userId ID of the user to be deleted.
     */
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
