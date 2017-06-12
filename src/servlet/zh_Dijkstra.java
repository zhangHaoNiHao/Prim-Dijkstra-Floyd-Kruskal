package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import text.Dijkstra_text;
import text.Kruskal_text;

/**
 * Servlet implementation class Dijkstra
 */
@WebServlet("/Dijkstra")
public class zh_Dijkstra extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public zh_Dijkstra() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		int m = Integer.MAX_VALUE;
		PrintWriter out=response.getWriter();
		String[] str1 = (String[])request.getParameterValues("v1");
		String[] str2 = (String[])request.getParameterValues("v2");
		String[] str3 = (String[])request.getParameterValues("v3");
		String str4 = request.getParameter("v4");
		int a[][]={
				{0,0,0,0,0},
				{m,0,0,0,0},
				{m,m,0,0,0},
				{m,m,m,0,0},
				{m,m,m,m,0}
				};
		
		for(int i=1;i<str1.length+1;i++)
		{
			a[0][i] = Integer.parseInt(str1[i-1]);
			a[i][0] = a[0][i];
		}
		for(int i=2;i<str2.length+2;i++)
		{
			a[1][i] = Integer.parseInt(str2[i-2]);
			a[i][1] = a[1][i];
		}
		for(int i=3;i<str3.length+3;i++)
		{
			a[2][i] = Integer.parseInt(str3[i-3]);
			a[i][2] = a[2][i];
		}
		a[3][4] = Integer.parseInt(str4);
		a[4][3] = a[3][4];
		
		Dijkstra_text dijkstra = new Dijkstra_text();
		String[] b = dijkstra.Dijsktra(a, 0);
		out.println("<center>");
		out.println("<h1>迪杰斯特拉算法</h1>");
		out.println("<hr>");
		for(int i=0;i<b.length;i++)
		{	
			out.println("从0到"+i+"的最短路径为："+b[i]);
			out.println("<br>");
		}
		out.println("</center>");
	}

}
