package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.MySQLConnection;

@WebServlet("/delete")
public class DeleteBTController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		long id = Long.parseLong(req.getParameter("id"));
		
		Connection con = MySQLConnection.getConnection();
		String sql = "delete from phim where id= ?";
		
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setLong(1, id);
			
			int result = statement.executeUpdate();
			con.close();
			
			if(result > 0) {
				resp.sendRedirect(req.getContextPath() + "/baitap");
			} else {
				System.out.println("Xóa không thành công");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resp.getWriter().append("<h2>Hello</h2>");
	}
	
}
