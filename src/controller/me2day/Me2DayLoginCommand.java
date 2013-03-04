package controller.me2day;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.LoginServiceImpl;
import controller.Command;
import dto.Me2DayMember;

public class Me2DayLoginCommand extends Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String result = request.getParameter("result");
		String userId = request.getParameter("user_id");
		String userKey = request.getParameter("user_key");
		String nextPage = null;
		
		Me2DayMember member = new Me2DayMember(userId, userKey);
		
		boolean flag = new LoginServiceImpl().me2DayLoginCheck(member);
		
		if(result.equals("true")){
			if(flag){
				HttpSession session = request.getSession();
				session.setAttribute("MEMBERID", userId);
				nextPage = "main.jsp";
			}else{
				request.setAttribute("msg", "가입되지 않은 미투데이 계정입니다.");
				nextPage = "error.jsp";
			}
		}else if(result.equals("false")){
			request.setAttribute("msg", "미투데이 로그인 시 권한습득에 실패했습니다.");
			nextPage = "error.jsp";
		}

		return nextPage;
	}

}
