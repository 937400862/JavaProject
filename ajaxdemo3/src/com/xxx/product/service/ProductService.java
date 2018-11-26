package com.xxx.product.service;

import com.xxx.entity.Product;
import com.xxx.product.dao.ProductDaoImpl;

public class ProductService {
	ProductDaoImpl pd=new ProductDaoImpl();
	
	public Product findProductBuName(String name){
		Product p=pd.findProductByName(name);
		return p;
	}

}
