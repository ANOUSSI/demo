package com.udemy.demo.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {
    @PostMapping(value = "/users")
    public ResponseEntity addUser( @RequestBody  @Valid User user){
        User user1=new User("anoussikamla@gmail.com");
        return new ResponseEntity(user1, HttpStatus.CREATED);

    }

}
