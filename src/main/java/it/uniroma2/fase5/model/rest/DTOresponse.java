package it.uniroma2.fase5.model.rest;

import it.uniroma2.fase5.model.Goal;
import it.uniroma2.fase5.model.MeasurementGoal;
import it.uniroma2.fase5.model.Metric;
import it.uniroma2.fase5.model.Problem;
import it.uniroma2.fase5.model.Question;
import it.uniroma2.fase5.model.Strategy;
import it.uniroma2.fase5.model.Student;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class DTOresponse extends DTO {

	public DTOresponse(DTO dto, String string) {
			
		this.error = dto.getError();
		this.message = string;
		
	}

	public DTOresponse(){
		
	}
	
	public String getProblemid() {
		return problemid;
	}

	public void setProblemid(String problemid) {
		this.problemid = problemid;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentsurname() {
		return studentsurname;
	}

	public void setStudentsurname(String studentsurname) {
		this.studentsurname = studentsurname;
	}


	
	public List<Student> getStudents() {
		return students;
	}

	public List<Problem> getProblems() {
		return problems;
	}
	public List<Metric> getMetrics() {
		return metrics;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void setProblems(List<Problem> problems) {
		this.problems = problems;
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
	private List<Student> students;
	
	@JsonInclude(Include.NON_NULL)
	private List<Problem> problems;
	
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
}
