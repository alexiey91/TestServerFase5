package it.uniroma2.fase5.model.rest;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class DTOMetric  extends DTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonInclude(Include.NON_NULL)
	private String id;
	@JsonInclude(Include.NON_NULL)
	private String metricId;
	@JsonInclude(Include.NON_NULL)
	private String description;
	@JsonInclude(Include.NON_NULL)
	private String count; // Numero di misure associate alla metrica
	@JsonInclude(Include.NON_NULL)
	private List<String> metricUnits;
	@JsonInclude(Include.NON_NULL)
	private String scaleType;
	@JsonInclude(Include.NON_NULL)
	private String range;
	@JsonInclude(Include.NON_NULL)
	private String creationDate;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMetricId() {
		return metricId;
	}
	public void setMetricId(String metricId) {
		this.metricId = metricId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public List<String> getMetricUnits() {
		return metricUnits;
	}
	public void setMetricUnits(ArrayList<String> metricUnits) {
		this.metricUnits = metricUnits;
	}
	public String getScaleType() {
		return scaleType;
	}
	public void setScaleType(String scaleType) {
		this.scaleType = scaleType;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
	
	
}
