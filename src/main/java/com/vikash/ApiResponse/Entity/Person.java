package com.vikash.ApiResponse.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;


import java.util.List;

@Entity
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int person_id;
    @NotEmpty(message = "username must not be empty")
    @Pattern(regexp = "[a-z]*" ,message="Invalid Request")
    String comment_from;
    @NotEmpty(message = "username must not be empty")
    @Pattern(regexp="[a-z]*",message = "Invalid Request")
    String comment_to;

    @OneToMany(cascade =CascadeType.ALL)
    @JoinColumn(name="p_id",referencedColumnName = "person_id")
    List<Comment> comments;

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getComment_from() {
        return comment_from;
    }

    public void setComment_from(String comment_from) {
        this.comment_from = comment_from;
    }

    public String getComment_to() {
        return comment_to;
    }

    public void setComment_to(String comment_to) {
        this.comment_to = comment_to;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
