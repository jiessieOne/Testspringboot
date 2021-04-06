package com.duying.customError;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController {

    @RequestMapping("/customErrorPage")
    public String customErrorPage(){
        return "customErrorPage";
    }


}
