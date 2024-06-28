package com.itacademy.servlet;

import com.itacademy.model.User;
import com.itacademy.service.CoffeeService;
import com.itacademy.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "HelloServlet", urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(session.getAttribute("coffeeList") == null){
            session.setAttribute("coffeeList", CoffeeService.getAvailableCoffeeList());
        }
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

}
