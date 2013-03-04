package dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import dto.Login;

public class AdminDAO {
	private static AdminDAO instance = null;
	private SqlMapClient sqlMapper = null;

	public static AdminDAO getInstance(){
		if(instance == null)
			instance = new AdminDAO();
		return instance;
	}

	private AdminDAO(){
		sqlMapper = DAOParser.getParser();
	}
	
	public boolean adminLoginCheck(Login login){
		boolean flag = false;
		Login result = null;
		
		try {
			result = (Login)sqlMapper.queryForObject("adminLoginCheck", login);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result != null) flag = true;
		
		return flag;
	}
}
