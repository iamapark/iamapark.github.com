package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.LoginServiceImpl;
import dto.Login;

public class LoginCommand extends Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String nextPage = null;
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		
		Login login = new Login(userId, password);
		boolean flag = new LoginServiceImpl().loginCheck(login);
		
		if(flag){
			nextPage = "main.jsp";
			HttpSession session = request.getSession();
			session.setAttribute("MEMBERID", userId);
		}else{
			nextPage = "error.jsp";
			request.setAttribute("msg", "아이디와 비밀번호를 확인하세요!");
		}
		
		return nextPage;
	}

}
