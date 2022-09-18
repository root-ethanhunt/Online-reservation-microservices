package io.railway.adminservice.controller;

import java.awt.PageAttributes.MediaType;
import java.util.Arrays;

import javax.annotation.PostConstruct;
//import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import io.railway.adminservice.entity.Admin;
import io.railway.adminservice.entity.Train;
import io.railway.adminservice.service.AdminService;

@RestController
@RequestMapping("/adminSearch")
public class AdminController {
	
	@Autowired
	private AdminService service;
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/saveAdmin")
	public Admin saveAdmin(@RequestBody Admin admin){
		return service.saveAdmin(admin);
		
	}
	
	
	//Get Method
	@GetMapping("getAdmin/{adminUserName}")
	public Admin getAdmin(@PathVariable ("adminUserName") String adminUserName) {
		return service.findByUserName(adminUserName);
		
	}
	
	//Update Method
	@PutMapping("updateProfile/{adminUserName}")
	public Admin updateAdmin(@PathVariable ("adminUserName") String adminUserName, @RequestBody Admin newAdmin)
	{
		Admin oldAdmin = service.findByUserName(adminUserName);
		oldAdmin.setPassword(newAdmin.getPassword());
		oldAdmin.setName(newAdmin.getName());
		service.saveAdmin(oldAdmin);
		return oldAdmin;
	}
	
	
//-----------------------------------------------TRAIN API CALL ------------------------------------------->
	
	
//	@PostMapping("/saveTrain")
//	public Train saveTrain(@RequestBody Train trainObject) {
//		ResponseEntity<Train> result = restTemplate.postForEntity("http://train-service/trainSearch/saveTrain",trainObject, Train.class);
//		System.out.println(result.getStatusCodeValue());
//		return result.getBody();
//	}
//	
	
	
	
//	@GetMapping("/getTrain/{id}")
//	public Object getTrain(@PathVariable("id") int id) {
//		Object trainObject = null;
//	
//		try {
//		 trainObject =restTemplate.getForObject("http://train-service/trainSearch/getById/"+id, Object.class);
//	}catch (Exception e) {
//		trainObject ="<h1>No train available";
//	}
//		finally {
//			return trainObject;
//		}
//	}
	
	
	
//	@PutMapping("updateTrain/{id}")
//	public Object updateTrain(@PathVariable("id") int id, @RequestBody Train train_new) {
//		restTemplate.put("http://train-service/trainSearch/updateById/"+id, train_new);
//		//Object train = restTemplate.getForObject("http://train-service/trainSearch/getById/"+id, Object.class);
//		return train_new;
//	}
//	
//	
//	@DeleteMapping("deleteTrain/{id}")
//	public String deleteTrain(@PathVariable("id") int id)
//	{
//		try {
//		restTemplate.delete("http://train-service/trainSearch/deleteTrainbyid/"+id);
//		return "Deleted Successfully";
//		}
//		catch(Exception Ex)
//		{
//			System.out.println(Ex.getMessage());
//			return "Not Deleted";
//		}
//	}
	
	
	
}
