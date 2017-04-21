package com.course.controller;

import com.course.model.Topic;
import com.course.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by addis on 4/21/17.
 */
@RestController
@RequestMapping("/app")
public class TopicCtrl {

    private final TopicService topicService;

    @Autowired
    public TopicCtrl(TopicService topicService) {
        this.topicService = topicService;
    }

    @RequestMapping(value = "/findall", method = RequestMethod.GET)
    public List<Topic> topics() {
        return topicService.findAll();
    }

    @RequestMapping(value = "/addtopic", method = RequestMethod.POST)
    public String addTopic(@RequestBody Topic topic) {

        topicService.addTopic(topic);
        return "inserted successfully";
    }

    @RequestMapping(value = "/updatetopic",method = RequestMethod.PUT)
    public String updateTopic(@RequestBody Topic topic) {
        topicService.updateTopic(1, topic);
        return "updated successfully";
    }

    @RequestMapping(value = "/deleteTopic/{id}",method = RequestMethod.DELETE)
    public String deleteTopic(@PathVariable int id) {

        topicService.deleteTopic(id);
        return "successfully deleted";
    }
    @RequestMapping(value = "/findone/{id}")
    public Topic findTopic(@PathVariable int id) {

        return topicService.findOne(id);
    }


}
