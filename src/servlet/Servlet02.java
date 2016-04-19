package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet02 extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpServletRequest httpReq = (HttpServletRequest)request;
		HttpServletResponse httpRes = (HttpServletResponse)response;
		
		//오호라~
		// 서블릿리퀘스트,리스폰스 객체는 
		//httpServletRequest 객체였구나~
		//그러니까 캐스팅 되는구나~
		
	response.setContentType("text/plain;charset=UTF-8");
	PrintWriter out = response.getWriter();
	
	out.println("ServletRequest를 통해 뽑아내는 정보:");
    out.printf("클라이언트 IP = %s\n", request.getRemoteAddr());
    out.printf("클라이언트 이름 = %s\n", request.getRemoteHost());
    out.printf("클라이언트 포트 = %s\n", request.getRemotePort());
    out.printf("프로토콜 이름 = %s\n", request.getScheme());
    
	
    out.println("HttpServletRequest를 통해 뽑아내는 정보:");
    out.printf("getContextPath(): %s\n", httpReq.getContextPath());
    out.printf("getMethod(): %s\n", httpReq.getMethod());
    out.printf("getPathInfo(): %s\n", httpReq.getPathInfo());
    out.printf("getQueryString(): %s\n", httpReq.getQueryString());
    out.printf("getRequestURI(): %s\n", httpReq.getRequestURI());
    out.printf("getRequestURL(): %s\n", httpReq.getRequestURL());
    out.printf("getServletPath(): %s\n", httpReq.getServletPath());
    out.printf("getHeader(User-Agent): %s\n", 
        httpReq.getHeader("User-Agent"));
    

	}

}
