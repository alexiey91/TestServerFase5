package it.uniroma2.fase5.model.rest;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


public class DTOMeasurementGoal  extends DTO{

	/**
	 * 
	 */		
	   
	private static final long serialVersionUID = 1L;
			
	@JsonInclude(Include.NON_NULL)
	private String measurementGoalId;
	@JsonInclude(Include.NON_NULL)
	private String description;
	@JsonInclude(Include.NON_NULL)
	private String creationDate;
	@JsonInclude(Include.NON_NULL)
	private String lastModified;
	@JsonInclude(Include.NON_NULL)
	private String timeFrame;
	@JsonInclude(Include.NON_NULL)
	public List<String> questionsRef;
	
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
	public List<String> getQuestionsRef() {
		return questionsRef;
	}
	public void setQuestionsRef(List<String> questionsRef) {
		this.questionsRef = questionsRef;
	}
	
				
}