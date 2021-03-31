package com.duying;

import com.duying.listener.CustomListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class EventListenerApp {
    public static void main( String[] args ) {
        ConfigurableApplicationContext context=SpringApplication.run(EventListenerApp.class,args);
        context.addApplicationListener(new CustomListener());
    }
}
