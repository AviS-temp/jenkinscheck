package com.example.demo.Repository;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Trainee;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee,Integer>{

	
	
	@Query(value="select u from Trainee u where traineeName=?1")
	public List<Trainee> findByName(String name);
	
	@Modifying
	@Transactional
	@Query(value="update Trainee set location=?1 where traineeId=?2")
	public int updateTrainee(String location,int traineeId);
	
}
