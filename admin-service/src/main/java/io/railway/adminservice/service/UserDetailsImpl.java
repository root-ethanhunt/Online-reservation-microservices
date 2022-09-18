package io.railway.adminservice.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.railway.adminservice.entity.Admin;

public class UserDetailsImpl implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String username;
	private String email;
	@JsonIgnore
	private String password;
	private Collection<? extends GrantedAuthority> authorities;
	
	
	public UserDetailsImpl(String id, String username, String email, String password) {
		
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	public static UserDetailsImpl build(Admin admin) {
		
		 List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
	        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
	        
		return new UserDetailsImpl(
				admin.getId(), 
				admin.getUsername(),
				admin.getEmail(),
				admin.getPassword()
				);
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}


	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDetailsImpl admin = (UserDetailsImpl) o;
		return Objects.equals(id, admin.id);
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
