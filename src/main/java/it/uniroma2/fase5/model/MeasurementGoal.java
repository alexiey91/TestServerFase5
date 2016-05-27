package it.uniroma2.fase5.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MeasurementGoal {
	
	@Id
	private String measurementGoalId;
   
    private String description;
    private String creationDate;
    private String lastModified;
    private String timeFrame;
    private String interpretationModel;
    private int version;
    @DBRef
    private List<Question> questionsRef;
    @DBRef
    private List<Metric> metricsRef;
    
	public MeasurementGoal(){
			
	}
	
	public MeasurementGoal(String measurementGoalId, String description, String creationDate, String lastModified,
			String timeFrame, String interpretationModel, int version) {
		super();
		this.measurementGoalId = measurementGoalId;
		this.description = description;
		this.creationDate = creationDate;
		this.lastModified = lastModified;
		this.timeFrame = timeFrame;
		this.interpretationModel = interpretationModel;
		this.version = version;
	}

	public MeasurementGoal(String measurementGoalId, String description, String creationDate, String lastModified,
			String timeFrame, String interpretationModel, int version, List<Question> questionsRef,
			List<Metric> metricsRef) {
		super();
		this.measurementGoalId = measurementGoalId;
		this.description = description;
		this.creationDate = creationDate;
		this.lastModified = lastModified;
		this.timeFrame = timeFrame;
		this.interpretationModel = interpretationModel;
		this.version = version;
		this.questionsRef = questionsRef;
		this.metricsRef = metricsRef;
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
	public List<Metric> getMetricsRef() {
		return metricsRef;
	}
	public void setMetricsRef(List<Metric> metricsRef) {
		this.metricsRef = metricsRef;
	}

	public String getInterpretationModel() {
		return interpretationModel;
	}

	public void setInterpretationModel(String interpretationModel) {
		this.interpretationModel = interpretationModel;
	}
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
}
