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
import com.rays.pojo.Admin;

/**
 * Servlet implementation class AdminRegDemo
 */
@WebServlet("/AdminRegDemo")
public class AdminRegDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminRegDemo() {
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
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String aname=request.getParameter("aname");
		String dob=request.getParameter("dob");
		String mobile=request.getParameter("mobile");
		Admin ad=new Admin(aname, dob, mobile);
		DaoDemo dd=new UserImpl();
		if(dd.create(ad)) {
			pw.print("<center>Admin Added Successfully...</center>");
			request.getRequestDispatcher("adminreg.jsp").include(request, response);
		}
		else
		{
			pw.print("<center>Failed to Add...</center>");
			request.getRequestDispatcher("adminreg.jsp").include(request, response);
		}
	}

}
