package uk.gergely.kiss.trainingapi.rest.api.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gergely.kiss.trainingapi.demo.DemoService;

/**
 * {@inheritDoc}
 */
@Service
public class DemoAPIServiceImpl implements DemoAPIService {

	@Autowired
	private DemoService demoService;
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getDemoMessage() {
		LOGGER.info("getDemoMessage was called");
		String demoMsg = demoService.getMessageFromDemoMessage();
		LOGGER.info("getDemoMessage demoMsg: "+ demoMsg);
		return demoMsg;
	}

}
