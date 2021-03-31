package com.duying.listener;


import com.duying.event.CustomEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener implements ApplicationListener<CustomEvent> {


    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMassage("第一种配置方案直接监听器");
    }


}
