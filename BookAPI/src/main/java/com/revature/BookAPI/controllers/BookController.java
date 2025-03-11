package com.revature.BookAPI.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController // combo of @Controller and @ResponseBody -- second turns things into json
@RequestMapping("/books")
@CrossOrigin
public class BookController {


    /*
    private final RestTemplate restTemplate;

    @Autowired
    public BookController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;


    }
     */


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

        //Instantiating a resttemplate so we can make http requests
        RestTemplate restTemplate =  new RestTemplate();

        //using RestTemplate to send an HTTP Request to another API
        //the String[].class passes it the blueprint instead of the object -- ie. passing the class instead of the object
        String[] recs = restTemplate.getForObject("http://localhost:8081/recs", String[].class);

        return ResponseEntity.ok(recs);

    }

}
