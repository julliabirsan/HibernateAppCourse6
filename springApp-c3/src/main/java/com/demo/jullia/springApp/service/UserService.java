package com.demo.jullia.springApp.service;

import com.demo.jullia.springApp.dao.julliaDemo.UserDao;
import com.demo.jullia.springApp.model.julliaDemo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public void save(String email, String password){
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        userDao.save(user);
    }

    public List<User> getUsersByEmail(String email){
       return userDao.findByEmail(email);
    }
}
