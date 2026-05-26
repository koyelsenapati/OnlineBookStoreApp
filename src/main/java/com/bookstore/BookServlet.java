package com.bookstore;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/books")
public class BookServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Online Book Store</h1>");
        out.println("<h2>Available Books</h2>");

        out.println("<ul>");
        out.println("<li>Java Programming - ₹500</li>");
        out.println("<li>Python Basics - ₹400</li>");
        out.println("<li>Web Development - ₹600</li>");
        out.println("</ul>");

        HttpSession session = request.getSession();
        session.setAttribute("user", "Koyel");

        out.println("<p>Session Created for User: "
                + session.getAttribute("user") + "</p>");

        out.println("</body></html>");
    }
}