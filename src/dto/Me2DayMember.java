package dto;

public class Me2DayMember {
	private String userId = null;
	private String userKey = null;
	
	public Me2DayMember() {
		super();
	}

	public Me2DayMember(String userId, String userKey) {
		super();
		this.userId = userId;
		this.userKey = userKey;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserKey() {
		return userKey;
	}

	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}
}
