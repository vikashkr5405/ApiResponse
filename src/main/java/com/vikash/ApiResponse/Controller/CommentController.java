package com.vikash.ApiResponse.Controller;

import com.vikash.ApiResponse.Entity.Comment;
import com.vikash.ApiResponse.Entity.Person;
import com.vikash.ApiResponse.Service.CommentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController
{

    @Autowired
    CommentService cserv;

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody Comment comment)
    {
        cserv.addUser(comment);
        return ResponseEntity.ok("comment added successfully");
    }
    @GetMapping
    public ResponseEntity<List<Comment>> findAll()
    {
        return new ResponseEntity<>(cserv.fetchAll(), HttpStatus.ACCEPTED);
    }


}
