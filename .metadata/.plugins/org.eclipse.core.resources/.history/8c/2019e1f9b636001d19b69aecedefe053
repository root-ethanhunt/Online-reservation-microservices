package com.Booking.Bookingservice.models;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "BookingInfo")
public class BookingInfo {
	@Id
	private String id;
	private String pnr;
	private int train_no;
	private String from_station;
	private String to_station;
	private String clas;
	private String quota;
	private String status;
	private int no_of_seats;
	private Timestamp time;
	public BookingInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingInfo(String pnr, int train_no, String from_station, String to_station, String clas, String quota,
			String status, int no_of_seats, Timestamp time) {
		super();
		this.pnr = pnr;
		this.train_no = train_no;
		this.from_station = from_station;
		this.to_station = to_station;
		this.clas = clas;
		this.quota = quota;
		this.status = status;
		this.no_of_seats = no_of_seats;
		this.time = time;
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
	public int getTrain_no() {
		return train_no;
	}
	public void setTrain_no(int train_no) {
		this.train_no = train_no;
	}
	public String getFrom_station() {
		return from_station;
	}
	public void setFrom_station(String from_station) {
		this.from_station = from_station;
	}
	public String getTo_station() {
		return to_station;
	}
	public void setTo_station(String to_station) {
		this.to_station = to_station;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public String getQuota() {
		return quota;
	}
	public void setQuota(String quota) {
		this.quota = quota;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getNo_of_seats() {
		return no_of_seats;
	}
	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
	
}
