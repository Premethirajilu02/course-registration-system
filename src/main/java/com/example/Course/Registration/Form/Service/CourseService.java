package com.example.Course.Registration.Form.Service;

import com.example.Course.Registration.Form.Model.Course;
import com.example.Course.Registration.Form.Model.CourseRegistry;
import com.example.Course.Registration.Form.Repository.CourseRepo;
import com.example.Course.Registration.Form.Repository.EnrolledRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo repo;

    @Autowired
    EnrolledRepo enrolledRepo;

    public List<Course> getallcouses() {
        return repo.findAll();
    }

    public List<CourseRegistry> coursesenrolled() {
        return enrolledRepo.findAll();
    }

    public void courseregister(String name, String emailId, String coursename) {
        CourseRegistry c=new CourseRegistry(name,emailId,coursename);
        enrolledRepo.save(c);
    }
}
