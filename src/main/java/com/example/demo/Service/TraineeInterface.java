package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Trainee;
public interface TraineeInterface {

	public List<Trainee> listAll();
	public List<Trainee> listByName(String name);
	public Trainee listById(int id);
	public int deleteTrainee(int id);
	public int updateTrainee(String Location,int id);
	public Trainee addTrainee(Trainee t);
	
	
	
	

}
