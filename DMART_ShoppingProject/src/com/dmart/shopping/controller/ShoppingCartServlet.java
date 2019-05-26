package com.dmart.shopping.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dmart.shopping.dao.DaoProductImpl;
import com.dmart.shopping.dao.IDaoProduct;


@WebServlet("*.do")
public class ShoppingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String jspName=" ";
    
    public ShoppingCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String command=(request.getServletPath()); 
		System.out.println("calls"+command);
		
		switch(command)
		{
			case "/GetALLUserDetails.do":
				{
					System.out.println("inside switch case");
					IDaoProduct service=new DaoProductImpl();
					
					try
					{
						ArrayList list=service.getAllProductDetails();
						System.out.println(list);
					}
					catch(SQLException e)
					{
						e.printStackTrace();
					}
					catch(ClassNotFoundException e)
					{
						e.printStackTrace();
					}
					System.out.println("Connected To Server");
					break;
				}
			default:{
				jspName="/index.html";
				break;
			}
					
		}
	}
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
