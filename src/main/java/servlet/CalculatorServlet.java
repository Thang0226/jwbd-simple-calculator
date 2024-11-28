package servlet;

import model.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String f_operand = req.getParameter("f_operand");
		String s_operand = req.getParameter("s_operand");
		String operator = req.getParameter("operator");
		try {
			Calculator calculator = new Calculator();
			float result = calculator.calculate(f_operand, operator, s_operand);
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<h1>Result:</h1>");
			out.println(f_operand + " " + operator + " " + s_operand + " = " + result);
			out.println("</html>");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Calculation failed! Cannot divide by zero!");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("Calculation failed! Cannot divide by zero!");
			out.println("</html>");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
