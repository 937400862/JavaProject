package com.xxx.product.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.xxx.entity.Product;
import com.xxx.product.service.ProductService;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ps")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String name=request.getParameter("name");
		System.out.println("商品请求名"+name);
		ProductService ps=new ProductService();
		Product p=ps.findProductBuName(name);
		response.getWriter().write("{name:'"+p.getName()+"',description:'"+p.getDescription()+"',price:'"+p.getPrice()+"',discountprice:'"+p.getDiscountprice()+"'}");
		//response.getWriter().write(new Gson().toJson(p));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
