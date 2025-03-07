import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {

	static int result = 0;

//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		int num1 = 0;
//		int num2 = 0;
//
//		String num1_ = request.getParameter("num1");
//		String num2_ = request.getParameter("num2");
//
//		if (num1_ == null || num1_.equals(""))
//			num1_ = "0";
//		if (num2_ == null || num2_.equals(""))
//			num2_ = "0";
//
//		num1 = Integer.parseInt(num1_);
//		num2 = Integer.parseInt(num2_);
//
//		result = num1 + num2;
//
//		// =======================================================
//
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
//
//		PrintWriter out = response.getWriter();
//
//		String view = """
//				        		<!DOCTYPE html>
//				<html>
//				<head>
//				<meta charset="UTF-8">
//				<title>Insert title here</title>
//				</head>
//				<body>
//					<section>
//						<h1>계산기 폼</h1>
//							<form >
//								<fieldset>
//									<div>
//										<label>숫자1</label>
//										<input name="num1">
//									</div>
//									<div>
//										<label>숫자2</label>
//										<input name="num2">
//									</div>
//									<div>
//										<button>계산하기</button>
//									</div>
//								</fieldset>
//							</form>
//							<div>
//								계산결과 : %d
//							</div>
//					</section>
//				</body>
//				</html>
//				        		""";
//		out.printf(view, result);
//	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int num1 = 0;
		int num2 = 0;

		String num1_ = request.getParameter("num1");
		String num2_ = request.getParameter("num2");

		num1 = Integer.parseInt(num1_);
		num2 = Integer.parseInt(num2_);

		result = num1 + num2;

		response.sendRedirect("calc");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		// int result = 0;

		String view = """
				        		<!DOCTYPE html>
				<html>
				<head>
				<meta charset="UTF-8">
				<title>Insert title here</title>
				</head>
				<body>
					<section>
						<h1>계산기 폼</h1>
							<form method="POST">
								<fieldset>
									<div>
										<label>숫자1</label>
										<input name="num1">
									</div>
									<div>
										<label>숫자2</label>
										<input name="num2">
									</div>
									<div>
										<button>계산하기</button>
									</div>
								</fieldset>
							</form>
							<div>
								계산결과 : %d
							</div>
					</section>
				</body>
				</html>
				        		""";
		out.printf(view, result);
	}
}