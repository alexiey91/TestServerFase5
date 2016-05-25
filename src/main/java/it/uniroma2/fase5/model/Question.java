package it.uniroma2.fase5.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Question {
	
	@Id
	private String questionId;
	
	private String description;
	private String creationDate;
	private String lastModified;
	private String timeFrame;
	@DBRef
	private List<Metric> metricsRef;

	public Question(){
		
	}
	public Question(String questionId, String description, String creationDate, String lastModified, String timeFrame,
			List<Metric> metricsRef) {
		super();
		this.questionId = questionId;
		this.description = description;
		this.creationDate = creationDate;
		this.lastModified = lastModified;
		this.timeFrame = timeFrame;
		this.metricsRef = metricsRef;
	}
	
	public Question(String questionId, String description, String creationDate, String lastModified, String timeFrame) {
		super();
		this.questionId = questionId;
		this.description = description;
		this.creationDate = creationDate;
		this.lastModified = lastModified;
		this.timeFrame = timeFrame;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
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
	public List<Metric> getMetricsRef() {
		return metricsRef;
	}
	public void setMetricsRef(List<Metric> metricsRef) {
		this.metricsRef = metricsRef;
	}
	
	
}
