package com.newlecture.controller.exam;

import java.io.IOException;

import com.newlecture.entity.Exam;
import com.newlecture.service.ExamService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/exam/list")
public class List extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int page = 1;

		ExamService service = new ExamService();

		Exam[] exams = service.getList();

// ---------------------------------------------------------------------------------------------
		String n = "최윤성";
		request.setAttribute("name", n);
		request.setAttribute("list", exams);
		request.getRequestDispatcher("/WEB-INF/view/exam/list.jsp").forward(request, response);

	}
}
