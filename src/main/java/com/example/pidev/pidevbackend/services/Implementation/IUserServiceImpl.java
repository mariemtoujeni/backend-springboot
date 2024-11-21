package com.example.pidev.pidevbackend.services.Implementation;

import com.example.pidev.pidevbackend.entities.User;
import com.example.pidev.pidevbackend.entities.enums.UserRoles;
import com.example.pidev.pidevbackend.repositories.UserRepository;
import com.example.pidev.pidevbackend.services.IUserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {
    private final UserRepository userRepository;
        IUserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        if(userRepository.existsById(id)) {
            System.out.println("User found with id: " + id);
            try {
                User user = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found with id: " + id));
                System.out.println("User details: " + user);
                userRepository.delete(user);
                System.out.println("User deleted successfully.");
            } catch (Exception e) {
                System.err.println("Error while deleting user: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            throw new EntityNotFoundException("User not found with id: " + id);
        }
    }


    @Override
    public void updateUser(User user) {
        if (userRepository.existsById(user.getId())) {
            userRepository.save(user);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    @Override
    public User getUser(long id) {
            if (userRepository.existsById(id)) {
                return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found with id: " + id));
            } else {
                throw new EntityNotFoundException("User not found with id: " + id);
            }
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
    @Override
    public List<User> getUserByRole(String role) {
        return userRepository.findByRole(UserRoles.valueOf(role));
    }
    @Override
public User login(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public void uploadFile(String path) {

        // TODO Auto-generated method stub

    }

}
