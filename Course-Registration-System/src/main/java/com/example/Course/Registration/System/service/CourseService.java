package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.repository.CourseRepo;
import com.example.Course.Registration.System.repository.CousreRegistryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    CousreRegistryRepo cousreRegistryRepo;
    public List<Course> availableCourses(){
        return courseRepo.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return cousreRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry=new CourseRegistry(name,emailId,courseName);
        cousreRegistryRepo.save(courseRegistry);
    }
}
