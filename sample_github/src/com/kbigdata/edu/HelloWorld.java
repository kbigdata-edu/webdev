package com.kbigdata.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hw")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloWorld() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("HelloWorld ~~~~");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>�ȳ��ϼ���!!!</h1>");
		writer.println("</body>");
		writer.println("</html>");
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost ~~~~");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>Post ��� �Դϴ�. getPost �޼ҵ尡 ȣ��Ǿ����ϴ�.</h1>");
		writer.println("</body>");
		writer.println("</html>");

	}

}
