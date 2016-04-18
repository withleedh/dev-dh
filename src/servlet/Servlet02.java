package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet02 extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text-plain;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("Çï·Î¿ì ¿ùµå");
		out.print("ùÀûÞ");
		
	}

	
}
