package it.uniroma2.fase5.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Status {
@Id
//definisce id di riferimento allo status dell'analisi
private String statusId;
// definisce se lo status è {accepted, rejected , unchecked}
private String status;
//data della creazione
private String creationDate;
//data dell'ultima modifica sensibile
private String lastModified;

@DBRef
//riferimento dello status all'id del gaol analizzato
private List<Goal> goalRef;

public Status(String statusId, String status, String creationDate,
		String lastModified, List<Goal> goalRef) {
	super();
	this.statusId = statusId;
	this.status = status;
	this.creationDate = creationDate;
	this.lastModified = lastModified;
	this.goalRef = goalRef;
}

public String getStatusId() {
	return statusId;
}

public void setStatusId(String statusId) {
	this.statusId = statusId;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getCreationDate() {
	return creationDate;
}

public void setCreationDate(String creationDate) {
	this.creationDate = creationDate;
}

public String getLastModified() {
	return lastModified;
}

public void setLastModified(String lastModified) {
	this.lastModified = lastModified;
}

public List<Goal> getGoalRef() {
	return goalRef;
}

public void setGoalRef(List<Goal> goalRef) {
	this.goalRef = goalRef;
}


}
