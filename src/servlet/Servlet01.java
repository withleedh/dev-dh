package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet01 extends GenericServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		
		
		
		res.setContentType("text/plain;charset=UTF-8");

		PrintWriter out = res.getWriter();

		out.printf("클라이언트 IP = %s\n", req.getRemoteAddr());

		out.printf("클라이름=%s\n", req.getRemoteHost());

		out.printf("클라이름=%s\n", req.getRemotePort());

		out.printf("프로토콜 네임 = %s\n", req.getProtocol());

	}

}