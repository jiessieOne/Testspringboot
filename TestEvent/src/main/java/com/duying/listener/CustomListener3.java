package com.duying.listener;

import com.duying.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListener3 {

    @EventListener
    public void printMassage(CustomEvent customEvent){
      customEvent.printMassage("第三种方式执行监听器");
    }
}
