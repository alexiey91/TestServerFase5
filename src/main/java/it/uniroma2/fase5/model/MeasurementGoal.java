package it.uniroma2.fase5.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MeasurementGoal {
	
	@Id
	String measurementGoalId;
   
    String description;
    String creationDate;
    String lastModified;
    String timeFrame;
    @DBRef
    List<Question> questionsRef;
	public MeasurementGoal(){
			
	}
	
	
	public MeasurementGoal(String measurementGoalId, String description, String creationDate, String lastModified,
			String timeFrame) {
		super();
		this.measurementGoalId = measurementGoalId;
		this.description = description;
		this.creationDate = creationDate;
		this.lastModified = lastModified;
		this.timeFrame = timeFrame;
	}


	public MeasurementGoal(String measurementGoalId, String description, String creationDate, String lastModified,
			String timeFrame, List<Question> questionsRef) {
		super();
		this.measurementGoalId = measurementGoalId;
		this.description = description;
		this.creationDate = creationDate;
		this.lastModified = lastModified;
		this.timeFrame = timeFrame;
		this.questionsRef = questionsRef;
	}
	

	public String getMeasurementGoalId() {
		return measurementGoalId;
	}
	public void setMeasurementGoalId(String measurementGoalId) {
		this.measurementGoalId = measurementGoalId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getLastModified() {
		return lastModified;
	}
	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	public String getTimeFrame() {
		return timeFrame;
	}
	public void setTimeFrame(String timeFrame) {
		this.timeFrame = timeFrame;
	}
	public List<Question> getQuestionsRef() {
		return questionsRef;
	}
	public void setQuestionsRef(List<Question> questionsRef) {
		this.questionsRef = questionsRef;
	}
		
}
