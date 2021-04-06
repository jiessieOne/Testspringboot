package com.duying.CustomException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CustomExceptionHandel {

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandel(Exception e){
        ModelAndView mv=new ModelAndView();
        mv.addObject("message",e.getMessage());
        mv.setViewName("errorPage");
        return mv;
    }
}
