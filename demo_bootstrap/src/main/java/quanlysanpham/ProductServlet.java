package quanlysanpham;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo_bootstrap.pojo.Product;

@WebServlet("/products")

public class ProductServlet extends HttpServlet {
	List<Product> listProducts = new ArrayList<Product>();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// List<quanlysanpham.pojo.Product> list = new ArrayList<quanlysanpham.pojo.Product>();
		
		req.setAttribute("products1", listProducts);
		RequestDispatcher dispatcher = req.getRequestDispatcher("product1.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String tensp = req.getParameter("tensp");
		int soluong = Integer.parseInt(req.getParameter("soluong"));
		String giaban = req.getParameter("giaban");
		
		Product product = new Product();
		product.setName(tensp);
		product.setGia(giaban);
		product.setSoLuong(soluong);
		
		listProducts.add(product);
		
		req.setAttribute("products1", listProducts);
		RequestDispatcher dispatcher = req.getRequestDispatcher("product1.jsp");
		dispatcher.forward(req, resp);
	}
}
