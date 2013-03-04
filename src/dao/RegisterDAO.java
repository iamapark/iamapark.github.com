package dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import dto.Me2DayMember;
import dto.Member;

public class RegisterDAO {
	private static RegisterDAO instance = null;
	private SqlMapClient sqlMapper = null;

	public static RegisterDAO getInstance(){
		if(instance == null)
			instance = new RegisterDAO();
		return instance;
	}

	private RegisterDAO(){
		sqlMapper = DAOParser.getParser();
	}
	
	public void registerMember(Member member){
		try {
			sqlMapper.insert("registerMember", member);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean registerMe2DayMember(Me2DayMember member){
		boolean flag = true;
		
		if(isExistMe2DayMember(member.getUserId())){
			System.out.println("존재하는 미투데이 계정입니다.");
			flag = false;
		}
		
		if(flag){
			try {
				sqlMapper.insert("registerMe2DayMember", member);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return flag;
	}
	
	private boolean isExistMe2DayMember(String userId){
		boolean flag = false;
		Me2DayMember member = null;
		
		try {
			member = (Me2DayMember)sqlMapper.queryForObject("isExistMe2DayMember", userId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(member != null) flag = true;
		
		return flag;
	}
	
	public boolean isExist(String userId){
		boolean flag = false;
		Member member = null;
		
		try {
			member = (Member)sqlMapper.queryForObject("isExist", userId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(member != null) flag = true;
		
		return flag;
	}
}
