package com.duying.listener;

import com.duying.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListener2 implements ApplicationListener<CustomEvent> {


    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMassage("第二种方式执行监听器");
    }
}
