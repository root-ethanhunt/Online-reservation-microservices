package io.railway.adminservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.railway.adminservice.entity.Train;
import io.railway.adminservice.service.TrainService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("trainSearch")
public class trainControl {

	@Autowired
	private TrainService tservice;

	@PostMapping("/saveTrain")
	public Train saveTrain(@RequestBody Train train) {
		Train train1 = tservice.saveTrain(train);
		return train1;
	}

	@GetMapping("/getTrainByStations/{from}/{to}")
	public List<Train> getTrains(@PathVariable("from") String from, @PathVariable("to") String to) {
		try {
			List<Train> list = tservice.trainsBetweenStations(from, to);
			return list;
		} catch (NullPointerException Ex) {
			System.out.println(Ex.getMessage());
		}
		return null;
	}
	
	@GetMapping("/getTrainById/{id}")
	public Train getTrainById(@PathVariable("id") int id) {
		try {
			Train list = tservice.findbytrainId(id).get();
			return list;
		} catch (NullPointerException Ex) {
			System.out.println(Ex.getMessage());
		}
		return null;
	}
	
	@GetMapping("/findByTrainName/{name}")
	public List<Train> getName(@PathVariable("name") String name)
	{
		return tservice.findTrainByName(name);
	}
	
	@GetMapping("/allTrains")
	public List<Train> getAllTrains() {
		List<Train> list = tservice.findAll();
		return list;

	}
	
	@PutMapping("updateById/{id}")
	public Train updateTrain(@PathVariable("id") int id, @RequestBody Train train0)
	{
		Train oldTr = tservice.findbytrainId(id).get();
		oldTr.setFrom_station(train0.getFrom_station());
		oldTr.setTo_station(train0.getTo_station());
		oldTr.setTotal_Seat_ac1(train0.getTotal_Seat_ac1());
		oldTr.setTotal_Seat_ac2(train0.getTotal_Seat_ac2());
		oldTr.setTotal_Seat_ac3(train0.getTotal_Seat_ac3());
		oldTr.setTotal_Seat_sleeper(train0.getTotal_Seat_sleeper());
		oldTr.setTrain_name(train0.getTrain_name());
		tservice.saveTrain(oldTr);
		return oldTr;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletebyid(@PathVariable("id") int id)
	{
		String srt = tservice.deleteTrainbyId(id);
		return srt;
	}

}
