package com.dmart.shopping.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.dmart.shopping.model.Product;

public class DaoProductImpl implements IDaoProduct {
	Connection conn=null;
	ArrayList<Product> list=new ArrayList<>();
	@Override
	public ArrayList<Product> getAllProductDetails() throws ClassNotFoundException,SQLException
	{
		System.out.println("inside dao layer");
	ResultSet rs = null;
	Statement stmt = null;
	Connection conn = null;
	
	Class.forName("com.mysql.jdbc.Driver");
	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqldb","root","");
	System.out.println("Connected");
	
	stmt = conn.createStatement();
	rs=stmt.executeQuery("select * from products");
	
	System.out.println(rs.toString());
	System.out.println("hello");
	
	while(rs.next()) {
		int id=rs.getInt("PID");
		String name=rs.getString("PNAME");
		double cost=rs.getDouble("PCOST");
		 
		System.out.println(id+" "+name+" "+cost);
	
		Product p=new Product(id,name,cost);
		list.add(p);
	}
	return list;
	
	
	}

}
