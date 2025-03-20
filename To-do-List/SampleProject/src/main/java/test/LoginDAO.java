package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class LoginDAO 
{
	public AdminBean ab=null;
	   public AdminBean login(String uN,String pW) 
	   {
		   try 
		   {
			 Connection con=DBConnection.getCon();
			 PreparedStatement ps=con.prepareStatement("select * from admin70 where uname=? and pword=?");
			 ps.setString(1, uN);
			 ps.setString(2, pW);
			 
			 ResultSet rs=ps.executeQuery();
			 if(rs.next()) {
				 ab=new AdminBean();
				 ab.setAdminname(rs.getString(1));
				 ab.setAdminpass(rs.getString(2));
				 ab.setAdminfname(rs.getString(3));
				 ab.setAdminlname(rs.getString(4));
				 ab.setAdmincity(rs.getString(5));
				 ab.setAdminmailid(rs.getString(6));
				 ab.setAdminphno(rs.getLong(7));
			 }
}catch(Exception e) {
	e.printStackTrace();
}
		return ab;
	   }
}
