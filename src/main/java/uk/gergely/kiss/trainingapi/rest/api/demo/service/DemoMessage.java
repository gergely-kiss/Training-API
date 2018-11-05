package uk.gergely.kiss.trainingapi.rest.api.demo.service;

public class DemoMessage {

	private int maxCharacterCount;
	private String message;
	private String overFlow;
	
	private static final int MAX_LENGTH = 256;
	
	public DemoMessage(String message) {
		this.maxCharacterCount = MAX_LENGTH;
		if(message.length() < maxCharacterCount) {
			this.message = message;
		}else{
			this.message = message.substring(0, maxCharacterCount);
			this.overFlow = message.substring(maxCharacterCount);
		}
	}
	
	public int getMaxCharacterCount() {
		return maxCharacterCount;
	}	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getOverFlow() {
		return overFlow;
	}

	public void setOverFlow(String overFlow) {
		this.overFlow = overFlow;
	}
	
	
	
	
}
