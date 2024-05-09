package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginform")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("ps");
		String cbox = request.getParameter("accept");
		Cookie ck = new Cookie("username", username);
		Cookie ck2 = new Cookie("ps", password);
		Cookie ck3 = new Cookie("accept", cbox);
		response.addCookie(ck);
		response.addCookie(ck2);
		response.addCookie(ck3);
		response.sendRedirect("profile");
	}

}
