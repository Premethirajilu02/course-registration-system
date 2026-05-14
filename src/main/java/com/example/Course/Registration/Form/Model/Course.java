package com.example.Course.Registration.Form.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Course {
    @Id
    private String id;
    private String name;
    private String coursename;
    private int duration;
}
