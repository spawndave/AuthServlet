package com.itacademy.servlet;

import com.itacademy.model.Coffee;
import com.itacademy.model.User;
import com.itacademy.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@WebServlet(name = "Login", urlPatterns="/login")
public class LoginServlet extends HttpServlet {
    private String error = "";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        User user = UserService.getUser(login, password);
        if(user != null){
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(30*60);
            session.setAttribute("user", user);
            session.setAttribute("drinckedCoffeeList", new ArrayList<Coffee>());
            response.sendRedirect("/home");
        }else {
            request.setAttribute("error", "Check login or password");
            doGet(request, response);
        }
    }
}
