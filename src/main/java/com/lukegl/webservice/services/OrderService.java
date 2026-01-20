package com.lukegl.webservice.services;

import com.lukegl.webservice.entities.Order;
import com.lukegl.webservice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long Id){
        Optional<Order> obj = repository.findById(Id);
        return obj.get();
    }
}
