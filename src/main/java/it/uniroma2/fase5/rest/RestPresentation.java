package it.uniroma2.fase5.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.uniroma2.fase5.controller.GoalService;
import it.uniroma2.fase5.controller.MeasurementGoalService;
import it.uniroma2.fase5.controller.MetricService;
import it.uniroma2.fase5.controller.ProjectService;
import it.uniroma2.fase5.controller.QuestionService;
import it.uniroma2.fase5.controller.StatusService;
import it.uniroma2.fase5.controller.RetrospectiveReportService;

import it.uniroma2.fase5.controller.StrategyService;
import it.uniroma2.fase5.model.rest.DTOGoal;
import it.uniroma2.fase5.model.rest.DTOMeasurementGoal;
import it.uniroma2.fase5.model.rest.DTOMetric;
import it.uniroma2.fase5.model.rest.DTOProject;
import it.uniroma2.fase5.model.rest.DTOQuestion;

import it.uniroma2.fase5.model.rest.DTOStatus;

import it.uniroma2.fase5.model.rest.DTORetrospectiveReport;

import it.uniroma2.fase5.model.rest.DTOStrategy;
import it.uniroma2.fase5.model.rest.DTOresponse;

@RestController
@RequestMapping("/")
public class RestPresentation {

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
	@Autowired
	StatusService statusService;
	@Autowired
	ProjectService projectService;
	@Autowired
	RetrospectiveReportService retrospectiveReportService;

	@RequestMapping(value = "/getQuestions/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getQuestions() {
		return questionService.getQuestions();
	}

	@RequestMapping(value = "/createQuestion/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createQuestion(
			@RequestBody DTOQuestion dtoQuestion) {

		return questionService.createQuestion(dtoQuestion.getQuestionID(),
				dtoQuestion.getDescription(), dtoQuestion.getCreationDate(),
				dtoQuestion.getLastModified(), dtoQuestion.getTimeFrame(),
				dtoQuestion.getVersion(), dtoQuestion.getFocus());

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
				dtoMetric.getLimH(), dtoMetric.getLimL(),
				dtoMetric.getCreationDate(), dtoMetric.getVersion());

	}

	@RequestMapping(value = "/deleteMetric/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> deleteMetric(
			@RequestBody DTOMetric dtoMetric) {

		return metricService.deleteMetric(dtoMetric.getMetricId());

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
					dtoMeasurementGoal.getObject(),
					dtoMeasurementGoal.getPurpose(),
					dtoMeasurementGoal.getQualityFocus(),
					dtoMeasurementGoal.getViewpoint(),
					dtoMeasurementGoal.getContext(),
					dtoMeasurementGoal.getCreationDate(),
					dtoMeasurementGoal.getLastModified(),
					dtoMeasurementGoal.getInterpretationModel(),
					dtoMeasurementGoal.getVersion());

		else
			return measurementGoalService.createMeasurementGoal(
					dtoMeasurementGoal.getMeasurementGoalId(),
					dtoMeasurementGoal.getObject(),
					dtoMeasurementGoal.getPurpose(),
					dtoMeasurementGoal.getQualityFocus(),
					dtoMeasurementGoal.getViewpoint(),
					dtoMeasurementGoal.getContext(),
					dtoMeasurementGoal.getCreationDate(),
					dtoMeasurementGoal.getLastModified(),
					dtoMeasurementGoal.getInterpretationModel(),
					dtoMeasurementGoal.getVersion(),
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
	public ResponseEntity<DTOresponse> createStrategy(
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
					dtoGoal.getObject(), dtoGoal.getMagnitude(),
					dtoGoal.getFocus(), dtoGoal.getCostraint(),
					dtoGoal.getOrganizationalScope(), dtoGoal.getDescription());
		else
			return goalService.createGoal(dtoGoal.getGoalId(),
					dtoGoal.getVersion(), dtoGoal.getCreationDate(),
					dtoGoal.getLastModified(), dtoGoal.getTimeFrame(),
					dtoGoal.getObject(), dtoGoal.getMagnitude(),
					dtoGoal.getFocus(), dtoGoal.getCostraint(),
					dtoGoal.getOrganizationalScope(), dtoGoal.getDescription(),
					dtoGoal.getMeasurementRef(), dtoGoal.getStrategyRef());

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

	@RequestMapping(value = "/createStatus/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createStatus(
			@RequestBody DTOStatus dtoStatus) {

		return statusService.createStatus(dtoStatus.getStatusId(),
				dtoStatus.getStatus(), dtoStatus.getCreationDate(),
				dtoStatus.getLastModified(), dtoStatus.getGoalRef());

	}

	@RequestMapping(value = "/getStatus/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getStatus() {
		return statusService.getStatus();
	}

	@RequestMapping(value = "/deleteStatus/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> deleteStatus(
			@RequestBody DTOStatus dtoStatus) {

		return statusService.deleteStatus(dtoStatus.getStatusId());

	}

	@RequestMapping(value = "/deleteAllStatus/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> deleteAllStatus() {

		return statusService.deleteAllStatus();

	}

	@RequestMapping(value = "/createProject/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createProject(
			@RequestBody DTOProject dtoProject) {

		return projectService.createProject(dtoProject.getProjectID(),
				dtoProject.getName(), dtoProject.getCreationDate(),
				dtoProject.getDescription(), dtoProject.getVersion(),
				dtoProject.getgoalRef());

	}

	@RequestMapping(value = "/getProject/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getproject() {
		return projectService.getProject();
	}

	@RequestMapping(value = "/deleteProject/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> deleteProject(
			@RequestBody DTOProject dtoProject) {

		return projectService.deleteProject(dtoProject.getProjectID());

	}

	@RequestMapping(value = "/deleteAllProject/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> deleteAllProject() {

		return projectService.deleteAllProject();

	}

	@RequestMapping(value = "/getRetrospectiveReports/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> getRetrospectiveReports() {
		return retrospectiveReportService.getRetrospectiveReports();
	}

	@RequestMapping(value = "/createRetrospectiveReport/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> createRetrospectiveReport(@RequestBody DTORetrospectiveReport dtoReport) {

		return retrospectiveReportService.createRetrospectiveReport(dtoReport.getRetrospectiveReportId(),
				dtoReport.getConclusion(), dtoReport.getLastModified(), dtoReport.getIds(),
				dtoReport.getPriorityList(),dtoReport.getDescriptionList());
	}
	@RequestMapping(value = "/deleteRetrospectiveReport/", method = RequestMethod.POST)
	public ResponseEntity<DTOresponse> deleteRetrospectiveReport(@RequestBody DTORetrospectiveReport dtoReport) {

		return retrospectiveReportService.deleteRetrospectiveReport(dtoReport.getRetrospectiveReportId());

	}

	@RequestMapping(value = "/deleteAllRetrospectiveReports/", method = RequestMethod.GET)
	public ResponseEntity<DTOresponse> deleteAllRetrospectiveReport() {

		return retrospectiveReportService.deleteAllRetrospectiveReport();

	}
	
}
