package com.duying.listener;

import com.duying.event.CustomEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener4 implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMassage("第四种方式执行监听器");
    }

}
