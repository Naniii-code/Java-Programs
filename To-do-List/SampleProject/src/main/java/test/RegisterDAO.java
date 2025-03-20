package test;
import java.sql.*;
public class RegisterDAO 
{
 
  public int register(String aName,String aPass,String afName,String alName,String aCity,String mId,long phNo) 
  {
	  int k = 0;
	try 
	{
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("insert into admin70 values(?,?,?,?,?,?,?)");
		ps.setString(1, aName);
		ps.setString(2, aPass);
		ps.setString(3, afName);
		ps.setString(4, alName);
		ps.setString(5, aCity);
		ps.setString(6, mId);
		ps.setLong(7, phNo);
		
		k=ps.executeUpdate();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return k;
	
	
	  
  }
}
