package service;

import dto.Me2DayMember;
import dto.Member;

public interface RegisterServiceIF {
	public void registerMember(Member member);
	public boolean registerMe2DayMember(Me2DayMember member);
	public boolean isExist(String userId);
}
