package com.course.Repsitory;

import com.course.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.net.CookieHandler;
import java.util.List;

/**
 * Created by addis on 4/21/17.
 */
public interface CourseRepository extends CrudRepository<Course,Integer> {

    List<Course> findByTopicId(int topicId);

}
