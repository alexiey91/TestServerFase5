package it.uniroma2.fase5.controller.implementation;

import it.uniroma2.fase5.controller.StrategyService;
import it.uniroma2.fase5.model.Goal;
import it.uniroma2.fase5.model.Strategy;
import it.uniroma2.fase5.model.rest.DTOresponse;
import it.uniroma2.fase5.repositories.StrategyRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("StrategyService")
public class StrategyServiceImpl implements StrategyService {

	@Autowired
	StrategyRepository strategyRepository;

	@Override
	public ResponseEntity<DTOresponse> createStrategy(String strategyId,
			List<String> context, List<String> assumptions, String description,
			String creationDate, String lastModified, String timeFrame,
			int version,List<Goal> goalRef) {
		// TODO Auto-generated method stub
		Strategy strategy = new Strategy(strategyId, context, assumptions,
				description, creationDate, lastModified, timeFrame, version, goalRef);
		strategyRepository.save(strategy);
		DTOresponse dtoresponse = new DTOresponse();
		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(
				dtoresponse, HttpStatus.OK);

		return response;
	}

	@Override
	public ResponseEntity<DTOresponse> getStrategies() {
		List<Strategy> strategies = strategyRepository.findAll();

		DTOresponse dtoresponse = new DTOresponse();
		dtoresponse.setStrategies(strategies);

		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(
				dtoresponse, HttpStatus.OK);

		return response;

	}

	@Override
	public ResponseEntity<DTOresponse> deleteStrategy(String strategyId) {
		// TODO Auto-generated method stub

		strategyRepository.delete(strategyRepository.findOne(strategyId));

		return null;
	}

}
