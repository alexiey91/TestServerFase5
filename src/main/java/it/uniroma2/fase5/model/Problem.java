package it.uniroma2.fase5.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Problem {
	
	@Id
	private String id;

	public Problem(){};
	
	public Problem(String cause){
		
		this.cause = cause;
		
	};
	
	private String cause;

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
