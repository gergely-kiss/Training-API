package uk.gergely.kiss.trainingapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * Entity class for storing demo messages 
 * @author kiss-
 *
 */
@Entity
public class DemoMessageVO {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String message;

	public DemoMessageVO(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "DemoMessageVO [id=" + id + ", message=" + message + "]";
	}
	
	
	
}
