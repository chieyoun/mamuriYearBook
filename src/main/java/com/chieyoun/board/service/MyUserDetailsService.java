package com.chieyoun.board.service;


import com.chieyoun.board.domain.MyUserDetails;
import com.chieyoun.board.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service(value = "userDetailsService")
public class MyUserDetailsService implements UserDetailsService {

    private UserService userService;

    @PostConstruct
    public void prepare() {
        User user = User.build("admin", "1234", "관리자", 9);
        userService.add(user);
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        try {
            User user = userService.read(username);
            return new MyUserDetails(user);
        } catch (IllegalArgumentException e) {
            throw new UsernameNotFoundException(username);
        }
    }
}
