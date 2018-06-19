package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/basket2")
public class BasketServlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8"); //타입응답한다
		PrintWriter out = response.getWriter();  //응답받은것을 출력하기위해 out변수에 담는다
		String img = request.getParameter("productID"); //productlog2에서 productID를 받아와 img 변수에 저장
		HttpSession session = request.getSession(); //HttpSession 저장형식을 사용하기 위해
		if (session.getAttribute("cnt") == null) { //만약 세션의 요소가 널이면
			session.setAttribute("cnt", new int[10]);//세션의 요소를 cnt로하고 크기가 10인 배열을 만들어라 
		}
		int product[] = (int[]) session.getAttribute("cnt"); //만든배열을 product배열에 저장해라
		
		if(img.equals("delete")){
			session.invalidate();
			out.println("<h1>삭제됫습니다.</h1>");
			out.print("<a href='/edu/htmlexam/productlog2.html'>상품선택화면</a>");
			out.close();
		}else{
	
			if(img.equals("p001")){ product[0]++;} //만약 img 와 p001이 같다면 p001제품 count를 1올린다
			else if(img.equals("p002")){ product[1]++;}
			else if(img.equals("p003")){ product[2]++;}
			else if(img.equals("p004")){ product[3]++;}
			else if(img.equals("p005")){ product[4]++;}
			else if(img.equals("p006")){ product[5]++;}
			else if(img.equals("p007")){ product[6]++;}
			else if(img.equals("p008")){ product[7]++;}
			else if(img.equals("p009")){ product[8]++;}
			else if(img.equals("p010")){ product[9]++;}
			
			out.println("<h1>선택한 상품리스트</h1>");
			out.println("<hr>");
			for(int i=0;i<product.length;i++){
				if(product[i]>0)
					out.println("<li>"+(i+1)+"상품"+product[i]+" 개!!!</li>");
				//만약 product의 카운터 갯수가 1이상이면(카운터되면) 카운터갯수 출력
			}
			out.print("<a href='/edu/htmlexam/productlog2.html'>상품선택화면</a>");
			out.print("<a href='/edu/basket2?productID=delete'>상품비우기</a>");
		}
		out.close();
	}
}
