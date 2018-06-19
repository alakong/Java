package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.VisitorDAO;
import model.VisitorVO;

@WebServlet("/visitor3")
public class VisitorServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("searchName");
		ArrayList<VisitorVO> list=null;
		if (name == null) {

			list = new VisitorDAO().list();
		} else {

			list = new VisitorDAO().listByName(name);
		}
		/*for (VisitorVO vo : list) {
			out.write(vo.getName());
			out.write(vo.getWriteDate());
			out.write(vo.getMemo() + "<br>");
		}

		out.write("<hr><a href='/edu/htmlexam/visitor.html'>방명록 쓰기</a>");
		
		out.print("<form method=\"get\" action='/edu/visitor3'>");
		out.print(" <input type=\"search\" name =\"searchName\" required><br/>");
		out.print("<input type=\"submit\" name=\"ok\" value=\"검색\"></form>");
		out.close();
	}*/

	// visitor.html에 데이터를 받아서 디비에 넣을것
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // 읽고 유니코드(utf-16)를 변환시켜내야함
		String name = request.getParameter("name");
		String memo = request.getParameter("text");
		VisitorDAO dao = new VisitorDAO();
		VisitorVO vo = new VisitorVO();
		vo.setName(name);
		vo.setMemo(memo);
		boolean result = dao.insert(vo);
		// html로 부터 post 받은 것
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		if (result) {
			out.println("<h2>" + name + "님의 글이 저장되었습니다. </h2>");
		} else {
			out.println("<h2>" + name + "님 오류발생했다요. </h2>");
		}
	/*	out.print("<a href='/edu/visitor3'>방명록 리스트 보기</a>"); // servlet에서href사용하면
																// get방식임

		out.print("<form method=\"get\" action='/edu/visitor3'>");
		out.print(" <input type=\"search\" name =\"searchName\" required><br/>");
		out.print("<input type=\"submit\" name=\"ok\" value=\"검색\"></form>");
		out.close();*/
	}
}
