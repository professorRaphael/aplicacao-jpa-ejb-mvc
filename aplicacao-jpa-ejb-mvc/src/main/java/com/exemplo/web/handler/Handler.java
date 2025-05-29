package com.exemplo.web.handler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;

public interface Handler {
    String execute(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException;
}