package edu.kh.yosangso.product.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.yosangso.product.model.service.ProductService;
import edu.kh.yosangso.product.model.vo.Product;

@WebServlet("/product/allProduct")
public class AllProductServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Product> apdList = new ArrayList<>();
		

		try {
			
			ProductService service = new ProductService();
			
			apdList = service.allProduct();
			
						
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		String path = "/WEB-INF/views/product/allProduct.jsp";
		
		req.setAttribute("apdList", apdList);

		System.out.println(apdList);
	
		req.getRequestDispatcher(path).forward(req, resp);
	}
}


