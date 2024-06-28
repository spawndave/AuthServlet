package com.itacademy.filter;

import com.itacademy.model.User;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebFilter(urlPatterns = "/*")
public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        String uri = request.getRequestURI();
        boolean isStaticResource = uri.startsWith("/resources") || uri.startsWith("/login") || uri.startsWith("/registration");
        if(user != null || isStaticResource){
            filterChain.doFilter(servletRequest, servletResponse);
        }else{
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            response.sendRedirect("/login");
        }
    }
}
