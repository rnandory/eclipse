package com.newlecture.controller.lotto;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/lotto/gen-auto")
public class GenAuto extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String lotto = "2 3 9 12 24 35";

		req.setAttribute("lotto", lotto);

		req.getRequestDispatcher("/WEB-INF/view/lotto/gen-auto.jsp").forward(req, resp);
	}
}