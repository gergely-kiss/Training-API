package uk.gergely.kiss.trainingapi.rest.api.demo;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.gergely.kiss.trainingapi.rest.api.demo.service.DemoAPIService;
import uk.gergely.kiss.trainingapi.rest.api.resources.APIConstants;

/**
 * Demo API
 * 
 * For trying out concepts.
 * @author kiss-
 *
 */
@RestController
public class DemoAPI {
	
	@Autowired
	private DemoAPIService demoAPIService;
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
		return demoAPIService.getDemoMessage();
	}

}
