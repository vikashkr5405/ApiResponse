package com.vikash.ApiResponse.Repo;

import com.vikash.ApiResponse.Entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>
{
    @Query("select c from Person c where c.comment_to=?1")
    public List<Person> findByName(String comment_to);

}
