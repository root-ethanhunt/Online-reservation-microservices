package io.railway.adminservice.payload.response;

public class JwtResponse {
	
	private String token;
	private String type = "Bearer";
	private String id;
	private String userName;
	private String email;
	public JwtResponse(String token, String id, String userName, String email) {
		this.token = token;
		this.id = id;
		this.userName = userName;
		this.email = email;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
