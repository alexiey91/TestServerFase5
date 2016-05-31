package it.uniroma2.fase5.model.rest;

import it.uniroma2.fase5.model.Goal;
import it.uniroma2.fase5.model.MeasurementGoal;
import it.uniroma2.fase5.model.Metric;
import it.uniroma2.fase5.model.Project;
import it.uniroma2.fase5.model.Question;
import it.uniroma2.fase5.model.Status;
import it.uniroma2.fase5.model.Strategy;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class DTOresponse extends DTO {

	public DTOresponse(DTO dto, String string) {

		this.error = dto.getError();
		this.message = string;

	}

	public DTOresponse() {

	}

	public void setMetrics(List<Metric> metrics) {
		this.metrics = metrics;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<MeasurementGoal> getMeasurementGoals() {
		return measurementGoals;
	}

	public void setMeasurementGoals(List<MeasurementGoal> measurementGoals) {
		this.measurementGoals = measurementGoals;
	}

	public List<Goal> getGoals() {
		return goals;
	}

	public void setGoals(List<Goal> goals) {
		this.goals = goals;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonInclude(Include.NON_NULL)
	private List<Metric> metrics;

	@JsonInclude(Include.NON_NULL)
	private List<Question> questions;

	@JsonInclude(Include.NON_NULL)
	private List<Goal> goals;

	@JsonInclude(Include.NON_NULL)
	private List<MeasurementGoal> measurementGoals;

	@JsonInclude(Include.NON_NULL)
	private List<Strategy> strategies;

	@JsonInclude(Include.NON_NULL)
	private List<Status> status;
	
	@JsonInclude(Include.NON_NULL)
	private List<Project> project;

	public List<Status> getStatus() {
		return status;
	}

	public void setStatus(List<Status> status) {
		this.status = status;
	}

	public List<Strategy> getStrategies() {
		return strategies;
	}

	public void setStrategies(List<Strategy> strategies) {
		this.strategies = strategies;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}
	
}
