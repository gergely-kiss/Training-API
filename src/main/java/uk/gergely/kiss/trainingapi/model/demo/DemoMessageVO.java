package uk.gergely.kiss.trainingapi.model.demo;

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
	private String demoMessage;

	public DemoMessageVO(String demoMessage) {
		this.demoMessage = demoMessage;
	}

	public DemoMessageVO() {
	}

	public String getDemoMessage() {
		return demoMessage;
	}

	public void setDemoMessage(String demoMessage) {
		this.demoMessage = demoMessage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DemoMessageVO [id=" + id + ", message=" + demoMessage + "]";
	}
	
	
	
}
