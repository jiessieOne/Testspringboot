package com.duying.controller;

import com.duying.event.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class EventListenerController {

    @Autowired
    private ApplicationEventPublisher publisher;

    @RequestMapping(value = "/index",produces = "text/html;charset=utf-8")
    @ResponseBody()
    public String index(){
        publisher.publishEvent(new CustomEvent(this));
        return "welcome to 峨山";
    }
}
