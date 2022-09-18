package com.Booking.Bookingservice.models;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BookingDetails")
public class BookingDetails {
	@Id
	private String id;
	private String pnr;
	private String name;
	private int age;
	private int seatNo;
	private String gender;
	private Date time;
	private String id_number;
	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingDetails(String pnr, String name, int age, int seatNo, String gender, Date time, String id_number) {
		super();
		this.pnr = pnr;
		this.name = name;
		this.age = age;
		this.seatNo = seatNo;
		this.gender = gender;
		this.time = time;
		this.id_number = id_number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	
	
}
