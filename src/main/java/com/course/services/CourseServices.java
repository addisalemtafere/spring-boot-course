package com.course.services;

import com.course.Repsitory.CourseRepository;
import com.course.model.Course;
import com.course.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by addis on 4/21/17.
 */
@Service
public class CourseServices {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseServices(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public List<Course> findAll(int id) {
        List<Course> courseList = new ArrayList<>();
        courseRepository.findByTopicId(id)
                .forEach(courseList::add);
        return courseList;
    }

    public void updateCoure(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(int id) {

        courseRepository.delete(id);

    }

    public Course findOne(int id) {
        return courseRepository.findOne(id);
    }
}
