package test;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet
{
   protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException 
   {
	   String aName=req.getParameter("adminname");
	   String aPass=req.getParameter("adminpass");
	   String afName=req.getParameter("adminfname");
	   String alName=req.getParameter("adminlname");
	   String aCity=req.getParameter("admincity");
	   String mId=req.getParameter("adminmailid");
	   long phNo=Long.parseLong(req.getParameter("adminphno"));
	   int reg = new RegisterDAO().register(aName, aPass, afName, alName,aCity, mId, phNo);
	   if(reg>0) 
	   {
		   HttpSession hs=req.getSession();
		   hs.setAttribute("Hi", "Registration successfull.....");
		   RequestDispatcher rd=req.getRequestDispatcher("message.jsp");
		   rd.forward(req, res);
		   
	   }
	  
	   
   }
}
