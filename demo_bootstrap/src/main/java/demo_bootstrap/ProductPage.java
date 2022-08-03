package demo_bootstrap;

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

@WebServlet("/product")
public class ProductPage extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Product> list = new ArrayList<Product>();
		
		Product product1 = new Product();
		product1.setName("Dầu gội đầu");
		product1.setSoLuong(1);
		product1.setGia("10.000 VNĐ");
		
		Product product2 = new Product();
		product2.setName("Dầu Xã");
		product2.setSoLuong(2);
		product2.setGia("15.000 VNĐ");
		
		Product product3 = new Product();
		product3.setName("Sữa Tắm");
		product3.setSoLuong(1);
		product3.setGia("20.000 VNĐ");
		
		list.add(product1);
		list.add(product2);
		list.add(product3);
		
		req.setAttribute("products", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("product.jsp");
		dispatcher.forward(req, resp);
	}
}
