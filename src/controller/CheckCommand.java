package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import service.RegisterServiceImpl;

public class CheckCommand extends Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		
		boolean flag = new RegisterServiceImpl().isExist(userId);
		JSONObject jsonObj = new JSONObject();
		if(flag){
			jsonObj.put("result", "true");
			request.setAttribute("result", jsonObj.toString());
		}else{
			jsonObj.put("result", "false");
			request.setAttribute("result", jsonObj.toString());
		}
		
		return "result.jsp";
	}
}