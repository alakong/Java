package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		int cal1 = Integer.parseInt(request.getParameter("number1"));
		int cal2 = Integer.parseInt(request.getParameter("number2"));
		String calc=request.getParameter("calc");
		int result=0;
		String url="calcResult.jsp";;
		if(calc.equals("+")){
			result=cal1+cal2;
		}else if(calc.equals("-")){
			result=cal1-cal2;
		}else if(calc.equals("*")){
			result=cal1*cal2;
		}else{
			if(cal2==0){
				url = "errorResult.jsp"; 
			}else{
				result=cal1/cal2;
			}
		}		 
		
		request.setAttribute("result",result);
		request.getRequestDispatcher("/jspexam/"+url).forward(request,response);
	}
}
