package com.duying.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    public void printMassage(String massage){
        System.out.println(massage);
    }
}
