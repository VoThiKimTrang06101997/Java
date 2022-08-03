package demo_cookie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getcookie")
public class GetCookieController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		for(Cookie cookie: cookies) {
			String name = cookie.getName();
			String value = cookie.getValue();
			
			System.out.println("Kiểm tra Cookie : " + name + "-" + value);
		}
		
		resp.getWriter().append("<h1>Get Cookie: </h1>");
	}
}
