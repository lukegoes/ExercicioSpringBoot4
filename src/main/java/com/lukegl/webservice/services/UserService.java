package com.lukegl.webservice.services;

import com.lukegl.webservice.entities.User;
import com.lukegl.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long Id){
        Optional<User> obj = repository.findById(Id);
        return obj.get();
    }

    public User insert(User obj){
        return repository.save(obj);
    }
}
