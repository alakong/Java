package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/visitor1")
public class VisitorServlet1 extends HttpServlet {

    public VisitorServlet1() {
        super();

    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		String userName = request.getParameter("name");
		GregorianCalendar today = new GregorianCalendar ( );
		int year = today.get ( today.YEAR );
		int month = today.get ( today.MONTH ) + 1;
		int day = today.get ( today.DAY_OF_MONTH );

		String memo= request.getParameter("text");
		out.println("<h1>"+userName+"님이  "+year+"년  "+month+"월  "+day+"일"
			+"에 남긴 글입니다"+"</h1>");
		out.println("<h2>"+"-----------------------------------------------------"+"</h2>");
		out.println("<h1>"+memo+"</h2>");
		out.close();		
	}

}
