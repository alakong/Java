package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/lotto2")
public class LottoServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		int number = Integer.parseInt(request.getParameter("num"));
		int result = (int) (Math.random() * 10) + 1;
		System.out.println("전달된값:" + number + "추출된 값:" + result);
		HttpSession session = request.getSession();
		if (session.getAttribute("cnt") == null) {
			session.setAttribute("cnt", new int[1]);
		}
		int lotto[] = (int[]) session.getAttribute("cnt");
		if (lotto[0] < 3) {
			if (result == number) {
				out.println("<h1 style=\"color:purple\";>추카추카 " + "재 응가를 하려면 브러우저를 재기동하세요</h1>");
				lotto[0] = 3;
			} else {
				out.println("<h1 style=\"color:red\";>다음기회에</h1>");
				out.print("<a href='/edu/htmlexam/lotto.html'>로또응가</a>");
			}
		} else {
			out.println("<h1 style=\"color:red\";>더이상 응모할수 없습니다. 브라우저를 재기동한후에 응모하세요</h1>");

		}
		lotto[0]++;
		out.close();
	}
}
