package com.Train.Trainmicroservice.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Train.Trainmicroservice.models.Train;
import com.Train.Trainmicroservice.repository.TrainRepo;

@Service
public class TrainService {

	@Autowired
	private TrainRepo trepo;
	
	public Train saveTrain(Train train)
	{
		return trepo.save(train);
	}
	
	public Optional<Train> findbytrainId(int id)
	{
		return trepo.findById(id);
	}
	
	public List<Train> trainsBetweenStations(String from, String to)
	{
		return trepo.findtrains(from, to);
	}
	
	public String deleteTrainbyId(int id)
	{
		trepo.deleteById(id);
		return "Deleted if found";
	}
	
	public List<Train> findTrainByName(String str)
	{
		return trepo.trainName(str);
	}
	
	public List<Train> findAll() {

		List<Train> list = new ArrayList<>();
		trepo.findAll().forEach(list::add);
		return list;
	}

}
