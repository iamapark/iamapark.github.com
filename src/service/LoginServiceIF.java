package service;

import dto.Login;
import dto.Me2DayMember;

public interface LoginServiceIF {
	public boolean loginCheck(Login login);
	public boolean me2DayLoginCheck(Me2DayMember member);
}
