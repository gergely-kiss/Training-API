package uk.gergely.kiss.trainingapi.rest.demo.service;

import java.util.logging.Logger;

/**
 * API Service for the DemoAPI
 */

public interface DemoAPIService {
	 final Logger LOGGER = Logger.getLogger(String.valueOf(DemoAPIService.class));
		
	/**getDemoMessage
	 * 
	 * @return String
	 * Returning the predefined demo message.
	 */
	public String getDemoMessage();
}