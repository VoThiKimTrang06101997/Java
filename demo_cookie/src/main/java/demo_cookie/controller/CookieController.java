package demo_cookie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/democookie")

public class CookieController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Cookie cookie = new Cookie("demo", "Hello cookie");
//		cookie.setMaxAge(1800);
//		resp.addCookie(cookie);
		
		/* Cookie là 1 mảng nên phải duyệt mảng */
		Cookie[] cookies = req.getCookies();
		boolean isRedirect = false;
		
		for (Cookie cookie : cookies) {
			String name = cookie.getName();
			if(name.equals("username")) {
				isRedirect = true;
//				if(value.trim().length() > 0) {
//				
//			}
			}
		}
		
		if(isRedirect) {
			resp.sendRedirect(req.getContextPath() + "/welcome");
		}else {
			req.getRequestDispatcher("democookie.jsp")
			.forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String remember = req.getParameter("remember");
		
		if(username.toLowerCase().equals("cybersoft")
				&& password.equals("123")
				) {
			//Đăng nhập thành công
			if(remember != null) {
				//Đã check vào checkbox
				Cookie cookie = new Cookie("username", username);
				cookie.setMaxAge(1800);
				resp.addCookie(cookie);
			}
			
			resp.sendRedirect(req.getContextPath() + "/welcome");
			
		}else {
			//Đăng nhập thất bại
			
		}
		
		System.out.println("kiemtra " + remember);
	}
}
