package com.chieyoun.board.service;


import com.chieyoun.board.domain.User;
import com.chieyoun.board.domain.entity.UserEntity;
import com.chieyoun.board.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service(value = "userService")
public class UserService {

    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public User add(User user) {
        UserEntity entity = UserEntity.build(user);
        entity.setRegisterTime(new Date());
        entity.setPassword(passwordEncoder.encode(user.getPassword()));

        userRepository.save(entity);

        return read(entity.getUserIdx());
    }

    public User read(Long userIdx) {
        Optional<UserEntity> optional = userRepository.findById(userIdx);
        if (optional.isPresent()) {
            UserEntity entity = optional.get();
            return User.build(entity);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public User read(String email) {
        Optional<UserEntity> optional = userRepository.findByEmail(email);
        if (optional.isPresent()) {
            UserEntity entity = optional.get();
            return User.build(entity);
        } else {
            throw new IllegalArgumentException();
        }
    }
}