package demo_bootstrap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomePage extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// PrintWriter writer = resp.getWriter();
		req.setCharacterEncoding("UTF-8");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String message = " ";
		
		if(username.toLowerCase().equals("cybersoft") && password.equals("123")) {
			System.out.println("Kiểm tra thành công");
			message = "Hello" + username;
		} else {
			message = "Tài khoản không hợp lệ";
		}
		
		req.setAttribute("message", message);
		RequestDispatcher dispatcher = req.getRequestDispatcher("welcome.jsp");
		dispatcher.forward(req, resp);
		
		/*<% Code Java %>*/
		// Welcome: <% out.print(request.getAttribute("message")); %>
		
//		writer.append("<h1>" + message + "</h1>");
//		writer.close();
	}
	
	/* Tạo ra Page Product 
	 * Danh sách Product
	 * => chứa đối tượng Product [name, soluong, gia]
	 * Truyền ra page product và hiển thị lên thẻ table có sử dụng BootStrap
	 * */
}
