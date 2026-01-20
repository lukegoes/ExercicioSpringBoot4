package com.lukegl.webservice.repositories;

import com.lukegl.webservice.entities.Category;
import com.lukegl.webservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
