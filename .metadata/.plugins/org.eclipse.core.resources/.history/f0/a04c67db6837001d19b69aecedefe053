package io.railway.adminservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.railway.adminservice.entity.Admin;
import io.railway.adminservice.repo.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminrepo;

//	public Admin findByUserName(String userName) {
//		return adminrepo.findById(userName).get();
//	}
	public Admin findByUserName(String userName) {
		return adminrepo.findByUsername(userName);
	}

	public Admin saveAdmin(Admin admin) {
		return adminrepo.save(admin);
	}

	

}
