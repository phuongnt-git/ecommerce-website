package com.ecommerce.controller.shop.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.service.ProductService;

@WebServlet(name = "ViewAllProductServlet", value = "/view_all")
public class ViewAllProductServlet extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductService productService = new ProductService(request, response);
		productService.listAllProduct();
	}

}
