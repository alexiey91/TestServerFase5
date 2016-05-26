package it.uniroma2.fase5.rest;

import it.uniroma2.fase5.controller.GoalService;
import it.uniroma2.fase5.controller.MeasurementGoalService;
import it.uniroma2.fase5.controller.MetricService;
import it.uniroma2.fase5.controller.ProblemService;
import it.uniroma2.fase5.controller.QuestionService;
import it.uniroma2.fase5.controller.StrategyService;
import it.uniroma2.fase5.controller.StudentService;
import it.uniroma2.fase5.model.rest.DTOGoal;
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
	@Autowired
	GoalService goalService;

	@RequestMapping(value = "/getQuestions/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getQuestions() {
		return questionService.getQuestions();
	}

	@RequestMapping(value = "/createQuestion/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createQuestion(
			@RequestBody DTOQuestion dtoQuestion) {

		return questionService.createQuestion(dtoQuestion.getQuestionID(),
				dtoQuestion.getDescription(), dtoQuestion.getCreationDate(),
				dtoQuestion.getLastModified(), dtoQuestion.getTimeFrame());

	}

	@RequestMapping(value = "/getMetrics/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getMetrics() {
		return metricService.getMetrics();
	}

	@RequestMapping(value = "/createMetric/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createMetric(
			@RequestBody DTOMetric dtoMetric) {

		return metricService.createMetric(dtoMetric.getMetricId(),
				dtoMetric.getDescription(), dtoMetric.getCount(),
				dtoMetric.getMetricUnits(), dtoMetric.getScaleType(),
				dtoMetric.getRange(), dtoMetric.getCreationDate());

	}

	@RequestMapping(value = "/deleteMetric/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> deleteMetric(
			@RequestBody DTOMetric dtoMetric) {

		return metricService.deleteMetric(dtoMetric.getMetricId());

	}

	@RequestMapping(value = "/getStudents/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getStudents() {

		return studentService.getStudents();

	}

	@RequestMapping(value = "/createStudent/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createStudent(
			@RequestBody DTOStudent dtoStudent) {

		return studentService.createStudent(dtoStudent.getName(),
				dtoStudent.getSurname(), dtoStudent.getProblem());
	}

	@RequestMapping(value = "/updateStudent/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> updateStudent(
			@RequestBody DTOStudent dtoStudent) {

		return studentService.updateStudent(dtoStudent.getId(),
				dtoStudent.getName(), dtoStudent.getSurname(),
				dtoStudent.getProblem());

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
	public ResponseEntity<DTOresponse> createProblem(
			@RequestBody DTOProblem dtoProblem) {

		return problemService.createProblem(dtoProblem.getCause());

	}

	@RequestMapping(value = "/deleteProblem/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> deleteProblem(
			@RequestBody DTOProblem dtoProblem) {

		return problemService.deleteProblem(dtoProblem.getCause());

	}

	@RequestMapping(value = "/getMeasurementGoals/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getMeasurementGoals() {
		return measurementGoalService.getMeasurementGoals();
	}

	@RequestMapping(value = "/createMeasurementGoal/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createMeasurementGoal(
			@RequestBody DTOMeasurementGoal dtoMeasurementGoal) {

		if (dtoMeasurementGoal.getQuestionsRef() == null
				|| dtoMeasurementGoal.getMetricsRef() == null)
			return measurementGoalService.createMeasurementGoal(
					dtoMeasurementGoal.getMeasurementGoalId(),
					dtoMeasurementGoal.getDescription(),
					dtoMeasurementGoal.getCreationDate(),
					dtoMeasurementGoal.getLastModified(),
					dtoMeasurementGoal.getTimeFrame(),
					dtoMeasurementGoal.getInterpretationModel());
		else
			return measurementGoalService.createMeasurementGoal(
					dtoMeasurementGoal.getMeasurementGoalId(),
					dtoMeasurementGoal.getDescription(),
					dtoMeasurementGoal.getCreationDate(),
					dtoMeasurementGoal.getLastModified(),
					dtoMeasurementGoal.getTimeFrame(),
					dtoMeasurementGoal.getInterpretationModel(),
					dtoMeasurementGoal.getQuestionsRef(),
					dtoMeasurementGoal.getMetricsRef());
	}

	@RequestMapping(value = "/deleteMeasurementGoal/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> deleteMeasurementGoal(
			@RequestBody DTOMeasurementGoal dtoMeasurementGoal) {

		return measurementGoalService.deleteMeasurementGoal(dtoMeasurementGoal
				.getMeasurementGoalId());

	}

	@RequestMapping(value = "/deleteAllMeasurementGoal/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> deleteAllMeasurementGoal() {

		return measurementGoalService.deleteAllMeasurementGoal();

	}

	@RequestMapping(value = "/getStrategies/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getStrategies() {
		return strategyService.getStrategies();
	}

	@RequestMapping(value = "/createStrategy/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createtrategy(
			@RequestBody DTOStrategy dtoStrategy) {

		return strategyService.createStrategy(dtoStrategy.getStrategyId(),
				dtoStrategy.getContext(), dtoStrategy.getAssumptions(),
				dtoStrategy.getDescription(), dtoStrategy.getCreationDate(),
				dtoStrategy.getLastModified(), dtoStrategy.getTimeFrame(),
				dtoStrategy.getVersion(), dtoStrategy.getGoalRef());
	}

	@RequestMapping(value = "/deleteStrategy/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> deleteStrategy(
			@RequestBody DTOStrategy dtoStrategy) {

		return strategyService.deleteStrategy(dtoStrategy.getStrategyId());

	}

	@RequestMapping(value = "/createGoal/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createGoal(@RequestBody DTOGoal dtoGoal) {

		if (dtoGoal.getMeasurementRef() == null
				|| dtoGoal.getStrategyRef() == null)
			return goalService.createGoal(dtoGoal.getGoalId(),
					dtoGoal.getVersion(), dtoGoal.getCreationDate(),
					dtoGoal.getLastModified(), dtoGoal.getTimeFrame(),
					dtoGoal.getDescription(), dtoGoal.getContext(),
					dtoGoal.getAssumptions());
		else
			return goalService.createGoal(dtoGoal.getGoalId(),
					dtoGoal.getVersion(), dtoGoal.getCreationDate(),
					dtoGoal.getLastModified(), dtoGoal.getTimeFrame(),
					dtoGoal.getDescription(), dtoGoal.getContext(),
					dtoGoal.getAssumptions(), dtoGoal.getMeasurementRef(),
					dtoGoal.getStrategyRef());

	}

	@RequestMapping(value = "/getGoals/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getGoals() {
		return goalService.getGoals();
	}

	@RequestMapping(value = "/deleteGoal/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> deleteGoal(@RequestBody DTOGoal dtoGoal) {

		return goalService.deleteGoal(dtoGoal.getGoalId());

	}

	@RequestMapping(value = "/deleteAllGoal/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> deleteAllGoal() {

		return goalService.deleteAllGoal();

	}

}
