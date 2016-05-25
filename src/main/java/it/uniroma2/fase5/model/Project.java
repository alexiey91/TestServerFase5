package it.uniroma2.fase5.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Project {
	
	@Id
	private String projectID;
	
	private String name;
	private String creationDate;
	private String description;
	private String version;
	
	@DBRef
	private ArrayList<Goal> goalsRer;
	
	public Project(String projectID, String name, ArrayList<Goal> goalsRer, String version) {
		this.projectID = projectID;
		this.name = name;
		this.goalsRer = goalsRer;
		this.version = version;
	}

	public Project(String projectID, String name, String creationDate, String description,
			String version, ArrayList<Goal> goalsRer) {
		this.projectID = projectID;
		this.name = name;
		this.creationDate = creationDate;
		this.goalsRer = goalsRer;
		this.description = description;
		this.version = version;
	}

	public String getProjectID() {
		return projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public ArrayList<Goal> getGoalsRer() {
		return goalsRer;
	}

	public void setGoalsRer(ArrayList<Goal> goalsRer) {
		this.goalsRer = goalsRer;
	}
		
}
