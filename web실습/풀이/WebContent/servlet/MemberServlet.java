package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.vo.MemberVO;


@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // 읽고 유니코드(utf-16)를 변환시켜내야함
		String name = request.getParameter("name");
		String phonenumber = request.getParameter("phonenumber");
		String member = request.getParameter("member");
		String password = request.getParameter("password");
		MemberVO  vo = new MemberVO ();
		vo.setName(name);
		vo.setPhonenumber(phonenumber);
		vo.setMember(member);
		vo.setPassword(password); // html로 부터 post 받은 것
		
		request.setAttribute("member1",vo);
		request.getRequestDispatcher("/jspexam/memberView.jsp").forward(request,response);
	
	}
}