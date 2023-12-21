package com.example.SchoolSystem;
import java.util.Date;
import java.util.UUID;
public record StudentDTO(UUID studentId, String firstName, String lastName)
{
public StudentDTO(String firstName,String lastName){
    this(null,firstName,lastName);
}
public StudentDTO(String lastName){
    this(null,null,lastName);
}
}
