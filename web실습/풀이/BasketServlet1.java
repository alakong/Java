package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/basket1")
public class BasketServlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String img = request.getParameter("productID");
		out.println("<h1>"+img+"상품 1개!!!</h1>");
		out.print("<a href='/edu/htmlexam/productlog2.html'>상품선택화면으로 이동하기</a>");
		out.close();
	}
}
