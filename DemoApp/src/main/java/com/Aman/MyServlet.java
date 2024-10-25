package com.Aman;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("Hi<br>");

        ServletContext ctx = getServletContext();
        String name = ctx.getInitParameter("name");
        String phone = ctx.getInitParameter("Phone");

        out.println("Name: " + name + "<br>");
        out.println("Phone: " + phone);
    }
}
