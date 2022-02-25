package com.udemy.demo.book;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;


@RestController
public class BookController {
    @GetMapping(value = "/books")
    public ResponseEntity listBook(@RequestParam(required = false) BookStatus status){
        Book book=new Book();
        book.setTitle("Madame bovary");
        book.setCotegory(new Category("pelican"));
        return  new ResponseEntity(Arrays.asList(book), HttpStatus.OK);

    }
@PostMapping(value = "/books")
    public  ResponseEntity addBook(@RequestBody @Valid Book book ){
        return  new ResponseEntity( book,HttpStatus.CREATED);

}
@DeleteMapping(value = "/books/{bookId}")
/* ce endpoint permet de suprimer un livre en indiquant son bookId*/
  public ResponseEntity deleteBook(@PathVariable("bookId") String bookId){
        return new ResponseEntity(HttpStatus.NO_CONTENT);


}
@PutMapping (value = "/books/{booksId}")
public ResponseEntity update(@PathVariable("bookId") String bookId,@RequestBody Book book)
{
    return  new ResponseEntity (HttpStatus.OK);

}
@GetMapping(value = "/categorie")
    public  ResponseEntity litCategorie(){
      Category ca =new Category("maison blanche");
      Category Ca1=new Category("roman");

      return new ResponseEntity(Arrays.asList(ca,Ca1 ), HttpStatus.OK);
}

}
