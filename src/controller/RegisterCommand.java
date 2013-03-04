package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.RegisterServiceImpl;
import dto.Member;

public class RegisterCommand extends Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		Member member = new Member(userId, email, password, firstName, lastName);
		
		new RegisterServiceImpl().registerMember(member);
		
		return "index.jsp";
	}

}
