package uk.gergely.kiss.trainingapi.rest;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.gergely.kiss.trainingapi.restresources.APIConstants;

/**
 * Demo API
 * 
 * For trying out concepts. 
 */
@RestController
public class DemoAPI {
	private final String DEMO = APIConstants.URL_DEMO;
	private final Logger LOGGER = Logger.getLogger(String.valueOf(DemoAPI.class));

	/**getDemo
	 *  
	 * @return String
	 * Demo message from APIConstants
	 */
	@RequestMapping(DEMO)
	public String getDemo() {
		LOGGER.info("demo was called");
		return APIConstants.DEMO_MSG;
	}

}
