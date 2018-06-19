package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.vo.productVO;

@WebServlet("/cart")
public class ProductServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String fr = request.getParameter("pid");
		HttpSession session=request.getSession();
		if (session.getAttribute("cnt") == null) { //만약 세션의 요소가 널이면
			session.setAttribute("cnt", new productVO());//세션의 요소를 cnt로하고 크기가 10인 배열을 만들어라 
		}
		productVO vo=(productVO)session.getAttribute("cnt");
		if(fr.equals("p001")){
			vo.setHalabong(1);
		}else if(fr.equals("p002")){
			vo.setApple(1);
		}else{
			vo.setBanana(1);
		}
		request.setAttribute("key",vo);
		request.getRequestDispatcher("/jspexam/productView.jsp").forward(request,response);
	}

}
