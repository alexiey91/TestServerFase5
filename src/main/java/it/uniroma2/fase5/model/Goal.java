package it.uniroma2.fase5.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Goal {

	@Id
	private String gaolId;
	private int version;
	private String creationDate;
	private String lastModified;
	private String timeFrame;
	// private Enum state;
	private String description;
	private List<String> context;
	private List<String> assumption;

	@DBRef
	private List<MeasurementGoal> measurementRef;
	@DBRef
	private List<Strategy> strategyRef;

	public Goal() {

	}

	public Goal(String gaolId, int version, String creationDate,
			String lastModified, String timeFrame, String description,
			List<String> context, List<String> assumption) {
		super();
		this.gaolId = gaolId;
		this.version = version;
		this.creationDate = creationDate;
		this.lastModified = lastModified;
		this.timeFrame = timeFrame;
		this.description = description;
		this.context = context;
		this.assumption = assumption;
	}

	public String getGaolId() {
		return gaolId;
	}

	public void setGaolId(String gaolId) {
		this.gaolId = gaolId;
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

	public List<String> getAssumption() {
		return assumption;
	}

	public void setAssumption(List<String> assumption) {
		this.assumption = assumption;
	}

	public List<MeasurementGoal> getMeasurementRef() {
		return measurementRef;
	}

	public void setMeasurementRef(List<MeasurementGoal> measurementRef) {
		this.measurementRef = measurementRef;
	}

	public List<Strategy> getStrategyRef() {
		return strategyRef;
	}

	public void setStrategyRef(List<Strategy> strategyRef) {
		this.strategyRef = strategyRef;
	}

	public Goal(String gaolId, int version, String creationDate,
			String lastModified, String timeFrame, String description,
			List<String> context, List<String> assumption,
			List<MeasurementGoal> measurementRef, List<Strategy> strategyRef) {
		super();
		this.gaolId = gaolId;
		this.version = version;
		this.creationDate = creationDate;
		this.lastModified = lastModified;
		this.timeFrame = timeFrame;
		this.description = description;
		this.context = context;
		this.assumption = assumption;
		this.measurementRef = measurementRef;
		this.strategyRef = strategyRef;
	}

}
