package com.udemy.demo.borrow;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class BorrowController {


    @GetMapping(value = "/barrows")

    public ResponseEntity getMyBook(){
        Borrew borrew=new Borrew();
borrew.setAsDate(LocalDate.now());
return  new ResponseEntity( borrew, HttpStatus.OK);


    }
@PostMapping(value = "/borrows /{bookId}")
    public ResponseEntity  createBorrows(@PathVariable("bookId")  String bookId){
        return new ResponseEntity( HttpStatus.CREATED);
}
@DeleteMapping(value = "borrows/{borrowId}")
    public ResponseEntity deleteBorrows(@PathVariable("borrowId") String borrow){
        return  new ResponseEntity( HttpStatus.NO_CONTENT);
}


}
