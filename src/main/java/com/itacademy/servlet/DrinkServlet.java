package com.itacademy.servlet;

import com.itacademy.model.entity.Coffee;
import com.itacademy.service.CoffeeService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet("/coffee/drink")
public class DrinkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        HttpSession session = request.getSession();
       List<Coffee> drinckedCoffeeList = (List<Coffee>) session.getAttribute("drinckedCoffeeList");
        if(drinckedCoffeeList.size() < 4){
            CoffeeService coffeeService = new CoffeeService();
            drinckedCoffeeList.add(coffeeService.getCoffee(id));
        }
        session.setAttribute("drinckedCoffeeList", drinckedCoffeeList);
        response.sendRedirect("/home");
    }

}
