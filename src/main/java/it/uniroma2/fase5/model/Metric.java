package it.uniroma2.fase5.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Metric {
	@Id	
	private String metricId;
	
	private String description;
	private String count; // Numero di misure associate alla metrica
	private List<String> metricUnits;
	private String scaleType;
	private String range;
	private String creationDate;
	
	public Metric(){
		
	}
	
	public Metric(String metricId, String description, String count, List<String> metricUnits, String scaleType, String range,
			String creationDate) {
		super();
		this.metricId = metricId;
		this.description = description;
		this.count = count;
		this.metricUnits = metricUnits;
		this.scaleType = scaleType;
		this.range = range;
		this.creationDate = creationDate;
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
	public void setMetricUnits(List<String> metricUnits) {
		this.metricUnits = metricUnits;
	}
	public String getScaleType() {
		return scaleType;
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
	public void setBaseType(){
		this.scaleType="BASE";
	}
	public void setDeriveType(){
		this.scaleType="DERIVE";
	}
		
}
