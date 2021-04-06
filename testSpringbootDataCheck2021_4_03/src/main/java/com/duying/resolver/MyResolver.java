package com.duying.resolver;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
@Component
public class MyResolver implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        ModelAndView mv = new ModelAndView();
        if (status.equals(HttpStatus.NOT_FOUND)) {
            mv.setViewName("errorResolver");
            mv.addObject("message","这是一个挺好看的错误信息");
        }
        return mv;
    }

}
