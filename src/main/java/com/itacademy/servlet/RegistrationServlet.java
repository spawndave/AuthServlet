package com.itacademy.servlet;

import com.itacademy.model.User;
import com.itacademy.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "Registration", urlPatterns="/registration")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Registration servlet");
        request.getRequestDispatcher("/registration.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        System.out.println(login+" - "+ password);
        if(!Objects.equals(login, "") && !Objects.equals(password, "")){
            User user = new User(login, password, name);
            UserService.addUser(user);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("/home");
        }else {
            request.setAttribute("error", "Check credentials");
            doGet(request, response);
        }
    }
}
