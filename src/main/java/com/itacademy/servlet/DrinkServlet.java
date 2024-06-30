package com.itacademy.servlet;

import com.itacademy.model.Coffee;
import com.itacademy.service.CoffeeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/coffee/drink")
public class DrinkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        HttpSession session = request.getSession();
       List<Coffee> drinckedCoffeeList = (List<Coffee>) session.getAttribute("drinckedCoffeeList");
        if(drinckedCoffeeList.size() < 5){
            drinckedCoffeeList.add(CoffeeService.getCoffee(id));
        }
        session.setAttribute("drinckedCoffeeList", drinckedCoffeeList);
        response.sendRedirect("/home");
    }

}
