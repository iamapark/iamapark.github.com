package controller.me2day;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.RegisterServiceImpl;
import controller.Command;
import dto.Me2DayMember;

public class Me2DayRegisterCommand extends Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String result = request.getParameter("result");
		String userId = request.getParameter("user_id");
		String userKey = request.getParameter("user_key");
		String nextPage = null;
		
		Me2DayMember member = new Me2DayMember(userId, userKey);
		
		/*
		 * */
		
		if(result.equals("true")){
			nextPage = "index.jsp";
			if(!new RegisterServiceImpl().registerMe2DayMember(member)){
				nextPage = "error.jsp";
				request.setAttribute("msg", "이미 존재하는 미투데이 계정입니다.");
			}
		}else if(result.equals("false")){
			request.setAttribute("msg", "미투데이 로그인 시 권한습득에 실패했습니다.");
			nextPage = "error.jsp";
		}
		
		return nextPage;
	}
}