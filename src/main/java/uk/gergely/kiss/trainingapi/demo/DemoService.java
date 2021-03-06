package uk.gergely.kiss.trainingapi.demo;

import java.util.logging.Logger;
/**
 * Service for Demo the demo business process
 * @author kiss-
 *
 */
public interface DemoService {
	final Logger LOGGER = Logger.getLogger(String.valueOf(DemoService.class));
	/**
	 * Getting the message string from the demo message
	 * @return String 
	 */
	public String getMessageFromDemoMessage();
}
