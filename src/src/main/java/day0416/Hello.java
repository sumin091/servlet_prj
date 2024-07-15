package day0416;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1.HttpServlet을 상속받는다.
@SuppressWarnings("serial")

public class Hello extends HttpServlet {
	
	//2.요청방식을 처리할 수 있는 method를 overriding
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("request:"+request);
		System.out.println("response:"+response);
		
		//3.응답방식 설정(MIME-types 설정: servers/web.xml참조)
		response.setContentType("text/html;charset=UTF-8");//한글깨짐
		
		//4.접속자에게 응답할 수 있도록 출력스트림 얻기
		PrintWriter out= response.getWriter();
		
		//5.응답할 내용을 만들어서 출력
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<style type='text/css'>");
		out.println("div{border:1px solid #333; width:800px; height:200px;margin:0px auto}");
		out.println("</style>");
		out.println("<title>안녕하세요? Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div>");
		String name="이명화";
		out.println("<marquee>"+name+"</marquee>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}//doGet

}//class
