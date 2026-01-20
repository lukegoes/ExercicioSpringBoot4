package com.lukegl.webservice.services;

import com.lukegl.webservice.entities.Product;
import com.lukegl.webservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long Id){
        Optional<Product> obj = productRepository.findById(Id);
        return obj.get();
    }
}
