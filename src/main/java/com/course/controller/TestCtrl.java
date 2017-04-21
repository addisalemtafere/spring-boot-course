package com.course.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by addis on 4/21/17.
 */

@RestController
@RequestMapping(value = "/app")
public class TestCtrl {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "this is from course project";
    }
}
