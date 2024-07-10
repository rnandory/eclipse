package com.newlecture.controller.lotto;

import java.io.IOException;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/lotto/gen-manual")
public class GenManual extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("input", false);
		req.getRequestDispatcher("/WEB-INF/view/lotto/gen-manual.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// String[] -> int[]
		String[] lottoStrArr = req.getParameter("lotto_").split(" ");

		int[] lotto = new int[6];

		for (int i = 0; i < 6; i++) {
			lotto[i] = Integer.parseInt(lottoStrArr[i]);
		}

		// 정렬
		Arrays.sort(lotto);

		String lottoSorted_ = String.format("%d %d %d %d %d %d", lotto[0], lotto[1], lotto[2], lotto[3], lotto[4],
				lotto[5]);

		req.setAttribute("input", true);
		req.setAttribute("lottoSorted_", lottoSorted_);
		req.getRequestDispatcher("/WEB-INF/view/lotto/gen-manual.jsp").forward(req, resp);
	}
}
