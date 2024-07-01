package com.itacademy.servlet;

import com.itacademy.service.CoffeeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(session.getAttribute("coffeeList") == null){
            CoffeeService coffeeService = new CoffeeService();
            session.setAttribute("coffeeList", coffeeService.getAvailableCoffeeList());
        }
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

}
