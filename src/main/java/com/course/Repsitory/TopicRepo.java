package com.course.Repsitory;

import com.course.model.Topic;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by addis on 4/21/17.
 */
public interface TopicRepo extends CrudRepository<Topic,Integer> {
}
