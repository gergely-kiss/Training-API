package uk.gergely.kiss.trainingapi.rest.api.demo;

import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import uk.gergely.kiss.trainingapi.rest.api.demo.service.DemoAPIService;
import uk.gergely.kiss.trainingapi.rest.api.resources.APIConstants;

/**
 * Demo API
 * 
 * For trying out concepts.
 * @author kiss-
 *
 */
@Api
@Path(DemoAPI.DEMO)
@Component
@Consumes({ MediaType.APPLICATION_JSON })
//@Produces({ MediaType.APPLICATION_JSON })
public class DemoAPI {
	
	@Autowired
	private DemoAPIService demoAPIService;
	public final static String DEMO = APIConstants.DEMO;
	public final static String MESSAGE = APIConstants.MESSAGE;
	private final Logger LOGGER = Logger.getLogger(String.valueOf(DemoAPI.class));

	/**getDemo
	 *  
	 * @return String
	 * Demo message from APIConstants
	 */
	@GET
	@Path(DemoAPI.MESSAGE)
	public String getDemo() {
		LOGGER.info("demo was called");
		return demoAPIService.getDemoMessage();
	}

}