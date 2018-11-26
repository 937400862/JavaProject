package com.xxx.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xxx.entity.Product;
import com.xxx.util.BaseDao;

public class ProductDaoImpl {
	
	public Product findProductByName(String name){
		
		Connection conn=null;
		try {
			conn=BaseDao.getCon();
			PreparedStatement ps=conn.prepareStatement("select * from product where name=?");
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			Product p=null;
			while(rs.next()){
				p=new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setDescription(rs.getString(3));
				p.setPrice(rs.getInt(5));
				p.setDiscountprice(rs.getInt(6));
			}
			return p;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
