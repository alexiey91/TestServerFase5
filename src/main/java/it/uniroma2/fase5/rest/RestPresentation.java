package it.uniroma2.fase5.rest;

import it.uniroma2.fase5.controller.MeasurementGoalService;
import it.uniroma2.fase5.controller.MetricService;
import it.uniroma2.fase5.controller.ProblemService;
import it.uniroma2.fase5.controller.QuestionService;
import it.uniroma2.fase5.controller.StrategyService;
import it.uniroma2.fase5.controller.StudentService;
import it.uniroma2.fase5.model.rest.DTOMeasurementGoal;
import it.uniroma2.fase5.model.rest.DTOMetric;
import it.uniroma2.fase5.model.rest.DTOProblem;
import it.uniroma2.fase5.model.rest.DTOQuestion;
import it.uniroma2.fase5.model.rest.DTOStrategy;
import it.uniroma2.fase5.model.rest.DTOStudent;
import it.uniroma2.fase5.model.rest.DTOresponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestPresentation {

	@Autowired
	StudentService studentService;
	@Autowired
	ProblemService problemService;
	@Autowired
	MetricService metricService;
	@Autowired
	QuestionService questionService;
	@Autowired
	MeasurementGoalService measurementGoalService;
	@Autowired
	StrategyService strategyService;

	@RequestMapping(value = "/getQuestions/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getQuestions() {
		return questionService.getQuestions();
	}
	
	@RequestMapping(value = "/createQuestion/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createQuestion(@RequestBody DTOQuestion dtoQuestion) {
		
		if(dtoQuestion.getMetricsRef()==null)
			return questionService.createQuestion(dtoQuestion.getQuestionID(),dtoQuestion.getDescription(),
				dtoQuestion.getCreationDate(),dtoQuestion.getLastModified(),dtoQuestion.getTimeFrame());
		else	
			return questionService.createQuestion(dtoQuestion.getQuestionID(),dtoQuestion.getDescription(),
				dtoQuestion.getCreationDate(),dtoQuestion.getLastModified(),dtoQuestion.getTimeFrame(),dtoQuestion.getMetricsRef());
	}
	

	@RequestMapping(value = "/getMetrics/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getMetrics() {
		return metricService.getMetrics();
	}
	@RequestMapping(value = "/createMetric/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createMetric(@RequestBody DTOMetric dtoMetric) {

		return metricService.createMetric(dtoMetric.getMetricId(),dtoMetric.getDescription(),dtoMetric.getCount(),dtoMetric.getMetricUnits(),dtoMetric.getScaleType(),dtoMetric.getRange(),dtoMetric.getCreationDate());

	}
	@RequestMapping(value = "/deleteMetric/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> deleteMetric(@RequestBody DTOMetric dtoMetric) {

		return metricService.deleteMetric(dtoMetric.getMetricId());

	}
	
	@RequestMapping(value = "/getStudents/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getStudents() {

		return studentService.getStudents();

	}
	@RequestMapping(value = "/createStudent/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createStudent(@RequestBody DTOStudent dtoStudent) {

		return studentService.createStudent(dtoStudent.getName(), dtoStudent.getSurname(), dtoStudent.getProblem());
	}

	@RequestMapping(value = "/updateStudent/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> updateStudent(@RequestBody DTOStudent dtoStudent) {

		return studentService.updateStudent(dtoStudent.getId(),dtoStudent.getName(), dtoStudent.getSurname(), dtoStudent.getProblem());

	}
	@RequestMapping(value = "/getStudentsByName/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getStudentsByName(String name) {

		return studentService.getStudentsByName(name);

	}

	@RequestMapping(value = "/getProblems/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getProblems() {

		return problemService.getProblems();

	}

	@RequestMapping(value = "/createProblem/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createProblem(@RequestBody DTOProblem dtoProblem) {

		return problemService.createProblem(dtoProblem.getCause());

	}

	@RequestMapping(value = "/deleteProblem/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> deleteProblem(@RequestBody DTOProblem dtoProblem) {

		return problemService.deleteProblem(dtoProblem.getCause());

	}	
	@RequestMapping(value = "/getMeasurementGoals/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getMeasurementGoals() {
		return measurementGoalService.getMeasurementGoals();
	}
	@RequestMapping(value = "/createMeasurementGoal/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createMeasurementGoal(@RequestBody DTOMeasurementGoal dtoMeasurementGoal) {
		
		if(dtoMeasurementGoal.getQuestionsRef()==null)
			return measurementGoalService.createMeasurementGoal(dtoMeasurementGoal.getMeasurementGoalId(),dtoMeasurementGoal.getDescription(),
					dtoMeasurementGoal.getCreationDate(),dtoMeasurementGoal.getLastModified(),dtoMeasurementGoal.getTimeFrame());
		else	
			return measurementGoalService.createMeasurementGoal(dtoMeasurementGoal.getMeasurementGoalId(),dtoMeasurementGoal.getDescription(),
					dtoMeasurementGoal.getCreationDate(),dtoMeasurementGoal.getLastModified(),dtoMeasurementGoal.getTimeFrame(),dtoMeasurementGoal.getQuestionsRef());
	}
	@RequestMapping(value = "/deleteMeasurementGoal/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> deleteMeasurementGoal(@RequestBody DTOMeasurementGoal dtoMeasurementGoal ) {

		return measurementGoalService.deleteMeasurementGoal(dtoMeasurementGoal.getMeasurementGoalId());

	}	

	@RequestMapping(value = "/getStrategies/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getStrategies() {
		return strategyService.getStrategies();
	}
	
	@RequestMapping(value = "/createStrategy/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createtrategy(@RequestBody DTOStrategy dtoStrategy) {
		
		
			return strategyService.createStrategy(dtoStrategy.getStrategyId(),dtoStrategy.getContext(),dtoStrategy.getAssumptions(),dtoStrategy.getDescription(),dtoStrategy.getCreationDate(),dtoStrategy.getLastModified(),dtoStrategy.getTimeFrame(),dtoStrategy.getVersion(),dtoStrategy.getGoalRef());
	}
	
	@RequestMapping(value = "/deleteStrategy/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> deleteStrategy(@RequestBody DTOStrategy dtoStrategy ) {

		return strategyService.deleteStrategy(dtoStrategy.getStrategyId());

	}	
	
	
}
