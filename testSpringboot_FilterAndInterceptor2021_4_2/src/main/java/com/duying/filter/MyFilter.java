package com.duying.filter;

import lombok.extern.slf4j.Slf4j;


import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


//@Slf4j
@WebFilter(filterName="customFilter",urlPatterns={"/*"})
public class MyFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("do filter 满足条件过滤器执行放行****");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("Filter destroy");
    }
}
