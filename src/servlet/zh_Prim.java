package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import text.Prim_text;

/**
 * Servlet implementation class Prim
 */
@WebServlet("/Prim")
public class zh_Prim extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public zh_Prim() {
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
				{0,0,0,0,0,0},
				{0,m,0,0,0,0},
				{0,0,m,0,0,0},
				{0,0,0,m,0,0},
				{0,0,0,0,m,0},
				{0,0,0,0,0,m}
				};
		
		for(int i=2;i<str1.length+2;i++)
		{
			a[1][i] = Integer.parseInt(str1[i-2]);
			a[i][1] = a[1][i];
		}
		for(int i=3;i<str2.length+3;i++)
		{
			a[2][i] = Integer.parseInt(str2[i-3]);
			a[i][2] = a[2][i];
		}
		for(int i=4;i<str3.length+4;i++)
		{
			a[3][i] = Integer.parseInt(str3[i-4]);
			a[i][3] = a[3][i];
		}
		a[4][5] = Integer.parseInt(str4);
		a[5][4] = a[4][5];
		
		int verNum = a.length;        //�������
		int []lowerW = new int[verNum];    //��������
		int []edge = new int[verNum];        //������
		boolean []checked = new boolean[verNum];  //�ж��Ƿ����
		
		Prim_text prim = new Prim_text();
		String b = prim.prim(verNum-1, a);
		
		out.println("<center>");
		out.println("<h1>�Ͻ�˹�����㷨</h1>");
		out.println("<hr>");	
		out.println("��С�������ı�Ϊ��"+b);
		out.println("</center>");
		
		
	}

}
 