package it.uniroma2.fase5.model.rest;
import it.uniroma2.fase5.model.MeasurementGoal;
import it.uniroma2.fase5.model.Strategy;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class DTOGoal extends DTO {

private static final long serialVersionUID = 1L;
	
	@JsonInclude(Include.NON_NULL)
	private String goalId;
	@JsonInclude(Include.NON_NULL)
	private int version;
	@JsonInclude(Include.NON_NULL)
	private String creationDate;
	@JsonInclude(Include.NON_NULL)
	private String lastModified;
	@JsonInclude(Include.NON_NULL)
	private String timeFrame;
	@JsonInclude(Include.NON_NULL)
	private String description;
	@JsonInclude(Include.NON_NULL)		
	private List<String> context;
	@JsonInclude(Include.NON_NULL)
	private List<String> assumptions;
	
	@JsonInclude(Include.NON_NULL)
	private List<String> measurementRef;
	@JsonInclude(Include.NON_NULL)
	private List<String> strategyRef;
	
	
	
	
	public List<String> getMeasurementRef() {
		return measurementRef;
	}
	public void setMeasurementRef(List<String> measurementRef) {
		this.measurementRef = measurementRef;
	}
	public List<String> getStrategyRef() {
		return strategyRef;
	}
	public void setStrategyRef(List<String> strategyRef) {
		this.strategyRef = strategyRef;
	}
	public String getGoalId() {
		return goalId;
	}
	public void setGoalId(String goalId) {
		this.goalId = goalId;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getContext() {
		return context;
	}
	public void setContext(List<String> context) {
		this.context = context;
	}
	public List<String> getAssumptions() {
		return assumptions;
	}
	public void setAssumptions(List<String> assumptions) {
		this.assumptions = assumptions;
	}
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
