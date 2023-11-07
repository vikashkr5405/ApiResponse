package com.vikash.ApiResponse.Service;

import com.vikash.ApiResponse.Entity.Comment;
import com.vikash.ApiResponse.Entity.Person;
import com.vikash.ApiResponse.Repo.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class CommentService
{
    @Autowired
    CommentRepository crepo;

    public Comment addUser(Comment comment)
    {
      return  crepo.save(comment);
    }
    public List<Comment> fetchAll()
    {
        return crepo.findAll();
    }
}
