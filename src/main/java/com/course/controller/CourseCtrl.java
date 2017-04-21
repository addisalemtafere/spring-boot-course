package com.course.controller;

import com.course.model.Course;
import com.course.model.Topic;
import com.course.services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by addis on 4/21/17.
 */
@RestController

public class CourseCtrl {

    private final CourseServices courseServices;

    @Autowired
    public CourseCtrl(CourseServices courseServices) {
        this.courseServices = courseServices;
    }

    @RequestMapping(value = "/topic/{topicId}/course",method = RequestMethod.GET)
    public List<Course> courseList(@PathVariable int topicId) {

        return courseServices.findAll(topicId);
    }

    @RequestMapping(value = "/topic/{topicid}/course/{id}", method = RequestMethod.POST)
    public String addCourse(@RequestBody Course course,@PathVariable int topicid) {
        course.setTopic(new Topic(topicid,"",""));
        courseServices.addCourse(course);
        return "successfully inserted";
    }

    @RequestMapping(value = "/topic/{topicid}/course/{id}", method = RequestMethod.PUT)
    public String updateCourse(@RequestBody Course course,@PathVariable int topicId) {
        course.setTopic(new Topic(topicId,"",""));
        courseServices.updateCoure(course);
        return "successfully updated";
    }

    @RequestMapping(value = "/topic/{topicid}/course/{id}", method = RequestMethod.DELETE)
    public String deleteCourse(@PathVariable int id) {
        courseServices.deleteCourse(id);
        return "successfully deleted";
    }

    @RequestMapping(value = "/findone", method = RequestMethod.GET)
    public Course finOne(@PathVariable int id) {
        return courseServices.findOne(id);
    }

}
