package it.uniroma2.fase5.controller;

import it.uniroma2.fase5.model.rest.DTOresponse;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface StatusService {

	ResponseEntity<DTOresponse> createStatus(String statusId, String status,
			String creationDate, String lastModified, List<String> goalRef);

	ResponseEntity<DTOresponse> getStatus();

	public ResponseEntity<DTOresponse> deleteAllStatus();

	ResponseEntity<DTOresponse> deleteStatus(String statusId);

}
