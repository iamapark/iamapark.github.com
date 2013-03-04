package service;

import dao.RegisterDAO;
import dto.Me2DayMember;
import dto.Member;

public class RegisterServiceImpl implements RegisterServiceIF {

	@Override
	public void registerMember(Member member) {
		RegisterDAO.getInstance().registerMember(member);
	}

	@Override
	public boolean isExist(String userId) {
		return RegisterDAO.getInstance().isExist(userId);
	}

	@Override
	public boolean registerMe2DayMember(Me2DayMember member) {
		return RegisterDAO.getInstance().registerMe2DayMember(member);
	}
}
