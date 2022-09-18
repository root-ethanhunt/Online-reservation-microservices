package io.railway.adminservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.railway.adminservice.entity.Admin;
import io.railway.adminservice.repo.AdminRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	private AdminRepository adminRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Admin admin = adminRepository.findByUsername(userName);
//				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + userName));
		return UserDetailsImpl.build(admin);
	}

}
