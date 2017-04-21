package com.course.model;

import javax.persistence.*;

/**
 * Created by addis on 4/21/17.
 */
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private  String description;

    @ManyToOne
//    @JoinColumn(name = "topic_id")
    private Topic topic;

    public Course() {
    }

    public Course(String name, String description,int topicId) {
        super();
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"","");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
