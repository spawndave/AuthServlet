package com.itacademy.servlet;

import com.itacademy.model.entity.Coffee;
import com.itacademy.model.entity.User;
import com.itacademy.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Registration servlet");
        request.getRequestDispatcher("/registration.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService = new UserService();
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        User user = new User(login, password, name);
        boolean isRegistered = userService.register(user);
        if(isRegistered){
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(30*60);
            session.setAttribute("user", user);
            session.setAttribute("drinckedCoffeeList", new ArrayList<Coffee>());
            response.sendRedirect("/home");
        }else {
            request.setAttribute("error", "Check credentials");
            doGet(request, response);
        }
    }
}
