package it.uniroma2.fase5.model.rest;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import it.uniroma2.fase5.model.Goal;
import it.uniroma2.fase5.model.MeasurementGoal;
import it.uniroma2.fase5.model.Metric;
import it.uniroma2.fase5.model.Question;
import it.uniroma2.fase5.model.RetrospectiveReport;
import it.uniroma2.fase5.model.Strategy;

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
	private List<RetrospectiveReport> retrospectiveReports;
	
	@JsonInclude(Include.NON_NULL)
	private String problemid;

	@JsonInclude(Include.NON_NULL)
	private String studentid;

	@JsonInclude(Include.NON_NULL)
	private String studentname;

	@JsonInclude(Include.NON_NULL)
	private String studentsurname;

	public List<Strategy> getStrategies() {
		return strategies;
	}

	public void setStrategies(List<Strategy> strategies) {
		this.strategies = strategies;
	}

	public List<RetrospectiveReport> getRetrospectiveReports() {
		return retrospectiveReports;
	}

	public void setRetrospectiveReports(List<RetrospectiveReport> retrospectiveReports) {
		this.retrospectiveReports = retrospectiveReports;
	}
	
}
