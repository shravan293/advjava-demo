import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RegServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=res.getWriter();
		int id=Integer.parseInt(req.getParameter("regId"));
		String name=req.getParameter("regName");
		String email=req.getParameter("regEmail");
		String address=req.getParameter("regAddress");
		
		System.out.println(id+" "+name+" "+email+" "+address);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://@localhost:3306/spring_jdbc","root","root");
			PreparedStatement pstmt=con.prepareStatement("insert into regform values(?,?,?,?)");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, address);
			int result = pstmt.executeUpdate();
			if(result!=0) {
				pw.println("inserted succesfully");
			}else {
				pw.println("insertion failed");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
