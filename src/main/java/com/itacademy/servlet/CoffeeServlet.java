package com.itacademy.servlet;

import com.itacademy.model.Coffee;
import com.itacademy.service.CoffeeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CoffeeDrinkServlet", urlPatterns = "/coffee")
public class CoffeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Coffee coffee = CoffeeService.getCoffee(id);
        request.setAttribute("coffee", coffee);
        request.getRequestDispatcher("/coffee.jsp").forward(request,response);
    }

}
