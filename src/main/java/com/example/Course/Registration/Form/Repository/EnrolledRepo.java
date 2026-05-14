package com.example.Course.Registration.Form.Repository;

import com.example.Course.Registration.Form.Model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrolledRepo extends JpaRepository<CourseRegistry,Integer> {
}
