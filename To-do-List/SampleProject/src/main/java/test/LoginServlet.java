package test;
import java.io.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/log")

public class LoginServlet extends HttpServlet
{
   protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
	   String uN=req.getParameter("uname");
	   String pW=req.getParameter("pass");
	   AdminBean ab=new LoginDAO().login(uN, pW);
	   if(ab==null) {
		   
	   }else {
		   HttpSession hs=req.getSession();
		   hs.setAttribute("abean", ab);
		   RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
		   rd.forward(req, res);
		   
	   }
   }
}
