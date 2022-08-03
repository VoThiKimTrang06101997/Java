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

@WebServlet("/jdbc/insert")
public class JDBCInsertController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection con = MySQLConnection.getConnection();
		String sql = "insert into phim (ten_phim, dao_dien, ten_quoc_gia) values (?,?,?)";
		
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, "Doctor Strange 2");
			statement.setString(2, "David Johnson");
			statement.setString(3, "USA");
			
			int result = statement.executeUpdate();
			con.close();
			
			if(result > 0) {
				System.out.println("Insert thành công");
			} else {
				System.out.println("Insert không thành công");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resp.getWriter().append("<h2>Hello</h2>");
	}
}

 /*  * Tạo một website có form data (tên phim, tên đạo diễn, quốc gia)
	 * Khi click submit thì insert vào database và load dữ liệu thông tin phim lên table
	 * Khi click vào nút xoá thì phải xóa dữ liệu.
 * */
