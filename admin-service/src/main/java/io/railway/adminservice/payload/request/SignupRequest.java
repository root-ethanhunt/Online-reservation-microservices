package io.railway.adminservice.payload.request;



public class SignupRequest {

	
	private String username;

	
	private String email;

	
	private String password;
	
	private String name;

	public SignupRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SignupRequest(String username, String email, String password, String name) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	

}
