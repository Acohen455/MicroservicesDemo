package com.revature.BookAPI.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // combo of @Controller and @ResponseBody -- second turns things into json
@RequestMapping("/books")
@CrossOrigin
public class BookController {

    //Method that doesn't interact with any other API
    @GetMapping
    public ResponseEntity<String[]> getAllBooks() {

        //mocking the object
        String[] books = {"Flowers for Algernon", "The Hobbit", "The Lord of the Rings",
                "The Taming of the Shrew", "The Shining", "The Very Hungry Caterpillar"};

        return ResponseEntity.ok(books);
    }


    //Method that sends an HTTP request to another API to get book recommendations
    @GetMapping("/recs")
    public ResponseEntity<String[]> getBookRecs() {

        //using RestTemplate to send an HTTP Request to another API


    }

}
