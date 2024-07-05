package com.newlecture.controller.exam;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/exam/detail")
public class Detail extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * response.setCharacterEncoding("UTF-8");
		 * response.setContentType("text/html; charset=UTF-8");
		 */

		request.getRequestDispatcher("/WEB-INF/view/exam/detail.jsp").forward(request, response);

	}

}
