package com.stationaryshop.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stationaryshop.dao.DatabaseConnection;
import com.stationaryshop.dto.Item;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		  String button = request.getParameter("button");
		  List items;
		 DatabaseConnection connection= new DatabaseConnection();
		  	if (button.equalsIgnoreCase("showItems")) {	
		  		connection.addbulkItems();
		  		items=connection.showItems();
		  	  request.setAttribute("itemList", items);
			  request.getRequestDispatcher("showItems.jsp").forward(request, response);
	        } else if (button.equalsIgnoreCase("addItems")) {
	        	 request.getRequestDispatcher("addItems.jsp").forward(request, response);
	        } else if (button.equalsIgnoreCase("updateItems")) {
	        	 request.getRequestDispatcher("updateItems.jsp").forward(request, response);
	        } else if (button.equalsIgnoreCase("deletItems")) {
	        	 request.getRequestDispatcher("deletItems.jsp").forward(request, response);
		        }
	        else {
	        	 request.getRequestDispatcher("showItems.jsp").forward(request, response);
	        }

	       
	  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
