package com.dmart.shopping.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dmart.shopping.model.Product;

public interface IDaoProduct 
{ 
ArrayList<Product> getAllProductDetails() throws ClassNotFoundException,SQLException;

}
