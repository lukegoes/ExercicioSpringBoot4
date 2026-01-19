package com.lukegl.webservice.resources;

import com.lukegl.webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1001L, "Lucas", "luklg@outlook.com", "21965414955", "123456");
        return ResponseEntity.ok().body(u);
    }
}
