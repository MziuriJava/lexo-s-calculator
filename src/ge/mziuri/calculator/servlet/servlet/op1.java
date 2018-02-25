package ge.mziuri.calculator.servlet.servlet;

import ge.mziuri.calculator.servlet.Dao.CalculatorDaoimpl;
import ge.mziuri.calculator.servlet.Dao.Calculatordao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class op1 extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Calculatordao calculatordao = new CalculatorDaoimpl();
        int number1 = 0;
        int number2 = 0;
        try {
            number1 = Integer.parseInt(req.getParameter("number1"));
            number2 = Integer.parseInt(req.getParameter("number2"));
        } catch (NumberFormatException ex) {
            resp.sendRedirect("/error.html");
        }
        String operation = req.getParameter("operation");

        if( !operation.equals("/") && !operation.equals("+") && !operation.equals("-") && !operation.equals("*")   ){resp.sendRedirect("/error.html"); return ;}

        int result =calculatordao.operation1(number1,number2,operation);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + result + "</h1>" + "<a href=\"index.html\">Back</a>");
        return ;
    }
}
