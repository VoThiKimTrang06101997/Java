package demo_cookie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demo_cookie.common.Const;

@WebServlet("/getsession")

public class GetSessionController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String value = (String) session.getAttribute("hellosession");
		String value2 = (String) session.getAttribute(Const.sessionDemo);
		
		resp.getWriter().append("<h1>Get Session :" + value  + "</h1>")
						.append("<h3>Get Session :" + value2 + "</h3>");
		
	}
}


