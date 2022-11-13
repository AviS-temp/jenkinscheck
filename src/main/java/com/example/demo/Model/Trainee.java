package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trainee {
	@Id
	@GeneratedValue
private int traineeId;
private String traineeName;
private String domainName;
private String location;
public int getTraineeId() {
	return traineeId;
}
public void setTraineeId(int traineeId) {
	this.traineeId = traineeId;
}
public String getTraineeName() {
	return traineeName;
}
public void setTraineeName(String traineeName) {
	this.traineeName = traineeName;
}
public String getDomainName() {
	return domainName;
}
public void setDomainName(String domainName) {
	this.domainName = domainName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}
