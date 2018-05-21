package com.cn.utils.token;

public class TokenModel {
	
	private String userId;
	private String userName;
	private String token;
	private String confusionToken;
	
	public TokenModel(String userId, String userName, String token,String confusionToken) {
		this.userId = userId;
		this.userName = userName;
		this.token = token;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getConfusionToken() {
		return confusionToken;
	}

	public void setConfusionToken(String confusionToken) {
		this.confusionToken = confusionToken;
	}
}
