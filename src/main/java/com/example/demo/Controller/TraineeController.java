package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.TraineeServiceImpl;
import com.example.demo.Model.Trainee;


@RestController
public class TraineeController {
	
	@Autowired
	private TraineeServiceImpl service;

	  @PostMapping(path = "add/Trainee")
		public Trainee addProduct(@RequestBody Trainee traineeObj)
		{
		   
		   return service.addTrainee(traineeObj);
		}
	   @GetMapping(path="trainee/viewAll")
	   public List<Trainee> getAllProduct()
	   {
		   return service.listAll();
	   }
	   
	   @GetMapping(path="/trainee/byId/{traineeId}")
	   public Trainee findById(@PathVariable int traineeId) {
		   return service.listById(traineeId);
	   }
	 
	   @DeleteMapping("/trainee/delete/{traineeId}")
	   void deleteEmployee(@PathVariable int traineeId) {
	     service.deleteTrainee(traineeId);
	   
	   }
	   @GetMapping(path="/trainee/byName/{traineeName}")
	   public List<Trainee> findByName(@PathVariable String traineeName)
	   {
		   return service.listByName(traineeName);
	   }
	   @PutMapping(path="/trainee/update/{traineeId}/{location}")
	   public int updateProduct(@PathVariable("location") String location, @PathVariable("traineeId") int traineeId) {
		   return service.updateTrainee(location,traineeId);
	   }
	   
	   @GetMapping(path="/{location}")
	   public int getProduct(@PathVariable("location") String location) {
		   return service.findByLocation(location);
	   }
	   
}
	  

   
   