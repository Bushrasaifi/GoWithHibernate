package com.rays.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.dao.DaoDemo;
import com.rays.dao.Impl.UserImpl;
import com.rays.pojo.User;

/**
 * Servlet implementation class RegisterDemo
 */
@WebServlet("/RegisterDemo")
public class RegisterDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String dob=request.getParameter("dob");
		String email=request.getParameter("email");
		User us=new User(fname,lname,dob,email);
		DaoDemo db=new UserImpl();
		if(db.create(us))
		{
			pw.println("<center>Added Successfully...</center>");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
		else {
			pw.println("<center>Failed to add...</center>");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
		
		
		
	}

}
