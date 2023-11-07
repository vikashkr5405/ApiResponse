package com.vikash.ApiResponse.Controller;

import com.vikash.ApiResponse.Entity.Comment;
import com.vikash.ApiResponse.Entity.Person;
import com.vikash.ApiResponse.Service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Validated
public class PersonController
{
    @Autowired
    PersonService pserv;

    @PostMapping
    public ResponseEntity<?> addUser(@Valid @RequestBody Person person )
    {
        pserv.addUser(person);
        return ResponseEntity.ok("comment added successfully");
    }
    @GetMapping
    public ResponseEntity<List<Person>> findAll()
    {
        return new ResponseEntity<>(pserv.fetchAll(),HttpStatus.ACCEPTED);
    }
    @GetMapping("/commentTo/{comment_to}")
    public ResponseEntity<List<Person>> findByComment(@PathVariable String comment_to)
    {
        return ResponseEntity.ok(pserv.findByCommentTo(comment_to));
    }

}
