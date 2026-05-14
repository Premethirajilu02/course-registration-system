package com.example.Course.Registration.Form.Controller;

import com.example.Course.Registration.Form.Model.Course;
import com.example.Course.Registration.Form.Model.CourseRegistry;
import com.example.Course.Registration.Form.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> getallcourses(){
        return courseService.getallcouses();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> coursesenrolled(){
        return courseService.coursesenrolled();
    }

    @PostMapping("/courses/register")
    public String courseregister(@RequestParam("name") String name,
                                 @RequestParam("emailId") String emailId,
                                 @RequestParam("coursename") String coursename){
        courseService.courseregister(name,emailId,coursename);
        return "Congratulations!"+name+" Successfully registered a course "+coursename;
    }

}
