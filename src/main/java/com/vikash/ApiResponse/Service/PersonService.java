package com.vikash.ApiResponse.Service;

import com.vikash.ApiResponse.Entity.Comment;
import com.vikash.ApiResponse.Entity.Person;
import com.vikash.ApiResponse.Repo.CommentRepository;
import com.vikash.ApiResponse.Repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(timeout = 60)
public class PersonService
{
    @Autowired
    PersonRepository prepo;

    @Autowired
    CommentRepository crepo;
    public Person addUser(Person person )
    {
        Comment c=new Comment();
       return prepo.save(person);
    }

    public List<Person> fetchAll()
    {
        return prepo.findAll();
    }
    public List<Person> findByCommentTo(String comment_to)
    {
        return prepo.findByName(comment_to);
    }

}
