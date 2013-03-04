package service;

import dao.LoginDAO;
import dto.Login;
import dto.Me2DayMember;

public class LoginServiceImpl implements LoginServiceIF {

	@Override
	public boolean loginCheck(Login login) {
		return LoginDAO.getInstance().loginCheck(login);
	}

	@Override
	public boolean me2DayLoginCheck(Me2DayMember member) {
		return LoginDAO.getInstance().me2DayLoginCheck(member);
	}

}
