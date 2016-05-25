package it.uniroma2.fase5.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Goal {
	
	@Id
	private String id;
	
	private String name;
	private String surname;
	
	@DBRef
	private Problem problem;
	
	public Goal(){
			
	}
	
	public Goal(String name, String surname){
		
		this.name = name;
		this.surname = surname;
		
	}
	
	public Goal(String name, String surname, Problem problem){
		
		this.name = name;
		this.surname = surname;
		this.problem = problem;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Problem getProblem() {
		return problem;
	}
	public void setProblem(Problem problem) {
		this.problem = problem;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
