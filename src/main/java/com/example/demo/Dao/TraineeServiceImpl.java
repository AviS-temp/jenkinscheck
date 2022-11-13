package com.example.demo.Dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Trainee;
import com.example.demo.Repository.TraineeRepository;
import com.example.demo.Service.TraineeInterface;

@Service
public class TraineeServiceImpl implements TraineeInterface {
@Autowired
private TraineeRepository repo;

	@Override
	public List<Trainee> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Trainee> listByName(String name) {
		// TODO Auto-generated method stub
	return repo.findByName(name);
	}

	@Override
	public Trainee listById(int traineeId) {
		// TODO Auto-generated method stub
		return repo.findById(traineeId).get();
	}

	@Override
	public int deleteTrainee(int id) {
		// TODO Auto-generated method stub
		  repo.deleteById(id);
	       if(repo.existsById(id))
	       {
			return 1;
	       }
	       return 0;
		}

	

	@Override
	public int updateTrainee(String location, int id) {
		// TODO Auto-generated method stub
		Trainee t=repo.findById(id).get();
	
	int status=	repo.updateTrainee(location,id);
		
		
		
		return status;
	}

	@Override
	public Trainee addTrainee(Trainee t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	// Added for checking purposes
	public int findByLocation(String location) {
		return repo.findByLocation(location);
		
	}

}
