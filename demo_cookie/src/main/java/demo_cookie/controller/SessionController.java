package demo_cookie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demo_cookie.common.Const;

@WebServlet("/demosession")

public class SessionController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =  req.getSession();
		session.setAttribute("hellosession", "Hello Session");
		session.setAttribute(Const.sessionDemo, "Cybersoft Session");
		session.setMaxInactiveInterval(1800);
		
		resp.getWriter().append("<h1>Hello Session : </h1>");
	}
}
