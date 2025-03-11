package com.revature.RecommendationAPI.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recs")
@CrossOrigin
public class RecommendationController {

    /*
    * Theory Here
     */


    @GetMapping
    public ResponseEntity<String[]> getBookRecs(){

        //mocking the class
        String[] books = {"Rec1", "Rec2", "Rec3"};
        return ResponseEntity.ok(books);
    }

}
