package demo;

public class PRDEMO2{
 public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		IO.writeLine("line before redirect");
		IO.writeLine("line before redirect");
		response.sendRedirect("/test");
		IO.writeLine("line after redirect"); // Non-Compliant code
	}
}
