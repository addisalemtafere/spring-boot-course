package com.course.services;

import com.course.Repsitory.TopicRepo;
import com.course.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by addis on 4/21/17.
 */
@Service
public class TopicService {

    private final TopicRepo topicRepo;

    @Autowired
    public TopicService(TopicRepo topicRepo) {
        this.topicRepo = topicRepo;
    }

    public List<Topic> findAll() {
        List<Topic> topicList = new ArrayList<>();
        topicRepo.findAll()
                .forEach(topicList::add);

        return topicList;
    }

    public void addTopic(Topic topic) {
        topicRepo.save(topic);
    }

    public void updateTopic(int id, Topic topic) {
        topicRepo.save(topic);
    }

    public void deleteTopic(int id) {
        topicRepo.delete(id);
    }

    public Topic findOne(int id) {
        return topicRepo.findOne(id);
    }

}
