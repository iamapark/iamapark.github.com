package admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.AdminServiceImpl;
import controller.Command;
import dto.Login;

public class LoginCommand extends Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String adminId = request.getParameter("adminId");
		String password = request.getParameter("password");
		String nextPage = null;
		
		Login login = new Login(adminId, password);
		boolean flag = new AdminServiceImpl().adminLoginCheck(login);
		
		if(flag){
			nextPage = "main.jsp";
			HttpSession session = request.getSession();
			session.setAttribute("ADMINID", adminId);
		}else{
			request.setAttribute("msg", "아이디와 비밀번호를 확인하세요.");
			nextPage = "error.jsp";
		}
		
		return nextPage;
	}

}
