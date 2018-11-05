package uk.gergely.kiss.trainingapi.rest.api.demo.service;

import java.util.logging.Logger;

/**
 * API Service for the DemoAPI
 * @author kiss-
 *
 */
public interface DemoAPIService {
	 final Logger LOGGER = Logger.getLogger(String.valueOf(DemoAPIService.class));
		
	/**getDemoMessage
	 * 
	 * @return String
	 * Returning the predefined demo message.
	 */
	public String getMessageFromDemoMessage();
	
	public DemoMessage getDemoMessage();
}
