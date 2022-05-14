package com.hlong.oa.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 页面跳转Servlet
 */
@WebServlet(name = "ForwardServlet",urlPatterns = "/forward/*")
public class ForwardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();

        String subUri =uri.substring(1);
        String page = subUri.substring(subUri.indexOf("/"));
        request.getRequestDispatcher(page+".ftl").forward(request,response);
    }
}
