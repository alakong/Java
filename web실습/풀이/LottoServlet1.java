package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		int number = Integer.parseInt(request.getParameter("num"));
		int result=(int)(Math.random()*10)+1;
		System.out.println("전달된값:" +number+ "추출된 값:"+result);
		if(result==number)
			out.println("<h1 style=\"color:purple\";>추카추카</h1>");
		else
			out.println("<h1 style=\"color:red\";>다음기회에</h1>");
		out.print("<a href='/edu/htmlexam/lotto.html'>로또응모</a>");
		out.close();

	}
}
