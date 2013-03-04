package service;

import dao.AdminDAO;
import dto.Login;

public class AdminServiceImpl implements AdminServiceIF {

	@Override
	public boolean adminLoginCheck(Login login) {
		return AdminDAO.getInstance().adminLoginCheck(login);
	}
}
