package com.springboot.study.vuepro.controller;

import com.springboot.study.vuepro.entity.User;
import com.springboot.study.vuepro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getAll")
    public List<User> getAll(){
        List<User> all = userRepository.findAll();
        return all;
    }

}
