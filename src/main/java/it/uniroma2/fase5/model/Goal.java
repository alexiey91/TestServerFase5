package it.uniroma2.fase5.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Goal {

	@Id
	private String gaolId;
	// indica la versione del goal
	private int version;
	// indica la data di creazione
	private String creationDate;
	// indica la data di ultima modifica
	private String lastModified;
	// indica la durata
	private String timeFrame;
	// private Enum state;
	// indica l'ogetto del goal
	private String object;

	// indica la percetuale del goal
	private int magnitude;
	// indica una specificazione dell'object
	private String focus;
	// indica le limitazioni del goal
	private String costraint;
	// indica lo scopo organizativo del goal
	private String organizationalScope;
	// indica la descrizione del goal
	private String description;

	@DBRef
	private List<MeasurementGoal> measurementRef;
	@DBRef
	private List<Strategy> strategyRef;

	public Goal() {

	}

	public Goal(String gaolId, int version, String creationDate,
			String lastModified, String timeFrame, String object,
			int magnitude, String focus, String costraint,
			String organizationalScope, String description) {
		super();
		this.gaolId = gaolId;
		this.version = version;
		this.creationDate = creationDate;
		this.lastModified = lastModified;
		this.timeFrame = timeFrame;
		this.object = object;
		this.magnitude = magnitude;
		this.focus = focus;
		this.costraint = costraint;
		this.organizationalScope = organizationalScope;
		this.description = description;
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

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public int getMagnitude() {
		return magnitude;
	}

	public void setMagnitude(int magnitude) {
		this.magnitude = magnitude;
	}

	public String getFocus() {
		return focus;
	}

	public void setFocus(String focus) {
		this.focus = focus;
	}

	public String getCostraint() {
		return costraint;
	}

	public void setCostraint(String costraint) {
		this.costraint = costraint;
	}

	public String getOrganizationalScope() {
		return organizationalScope;
	}

	public void setOrganizationalScope(String organizationalScope) {
		this.organizationalScope = organizationalScope;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Goal(String gaolId, int version, String creationDate,
			String lastModified, String timeFrame, String object,
			int magnitude, String focus, String costraint,
			String organizationalScope, String description,
			List<MeasurementGoal> measurementRef, List<Strategy> strategyRef) {
		super();
		this.gaolId = gaolId;
		this.version = version;
		this.creationDate = creationDate;
		this.lastModified = lastModified;
		this.timeFrame = timeFrame;
		this.object = object;
		this.magnitude = magnitude;
		this.focus = focus;
		this.costraint = costraint;
		this.organizationalScope = organizationalScope;
		this.description = description;
		this.measurementRef = measurementRef;
		this.strategyRef = strategyRef;
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

}
