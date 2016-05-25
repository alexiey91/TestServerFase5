package it.uniroma2.fase5.model.rest;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class DTOQuestion  extends DTO{

	/**
	 * 
	 */		
	private static final long serialVersionUID = 1L;
			
	@JsonInclude(Include.NON_NULL)
	private String questionID;
	@JsonInclude(Include.NON_NULL)
	private String description;
	@JsonInclude(Include.NON_NULL)
	private String creationDate;
	@JsonInclude(Include.NON_NULL)
	private String lastModified;
	@JsonInclude(Include.NON_NULL)
	private String timeFrame;
	@JsonInclude(Include.NON_NULL)
	public List<String> metricsRef;
	
	public String getQuestionID() {
		return questionID;
	}
	public void setQuestionID(String questionID) {
		this.questionID = questionID;
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
	public List<String> getMetricsRef() {
		return metricsRef;
	}
	public void setMetricsRef(List<String> metricsRef) {
		this.metricsRef = metricsRef;
	}
						
}
