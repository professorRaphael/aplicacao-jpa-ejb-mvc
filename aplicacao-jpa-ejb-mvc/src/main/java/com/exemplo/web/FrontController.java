package com.exemplo.web;

import com.exemplo.web.handler.Handler;
import com.exemplo.web.handler.HandlerFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String action = req.getServletPath();
        Handler handler = HandlerFactory.getHandler(action);
        String view = handler.execute(req, resp);
        req.getRequestDispatcher(view).forward(req, resp);
    }
}