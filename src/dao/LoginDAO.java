package dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import dto.Login;
import dto.Me2DayMember;

public class LoginDAO {
	private static LoginDAO instance = null;
	private SqlMapClient sqlMapper = null;

	public static LoginDAO getInstance(){
		if(instance == null)
			instance = new LoginDAO();
		return instance;
	}

	private LoginDAO(){
		sqlMapper = DAOParser.getParser();
	}
	
	public boolean loginCheck(Login login){
		boolean flag = false;
		Login result = null;
		
		try {
			result = (Login)sqlMapper.queryForObject("loginCheck", login);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result != null) flag = true;
		
		return flag;
	}
	
	public boolean me2DayLoginCheck(Me2DayMember member){
		boolean flag = false;
		Me2DayMember result = null;
		
		try {
			result = (Me2DayMember)sqlMapper.queryForObject("me2DayLoginCheck", member);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result != null) flag = true;
		
		return flag;
	}
}
