package com.itacademy.servlet;

import com.itacademy.model.Coffee;
import com.itacademy.service.CoffeeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/coffee")
public class CoffeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        CoffeeService coffeeService = new CoffeeService();
        Coffee coffee = coffeeService.getCoffee(id);
        request.setAttribute("coffee", coffee);
        request.getRequestDispatcher("/coffee.jsp").forward(request,response);
    }

}
