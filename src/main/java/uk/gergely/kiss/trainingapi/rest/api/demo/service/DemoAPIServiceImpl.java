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
	public String getMessageFromDemoMessage() {
		LOGGER.info("getMessageFromDemoMessage was called");
		String demoMsg = demoService.getMessageFromDemoMessage();
		LOGGER.info("getMessageFromDemoMessage demoMsg: "+ demoMsg);
		return demoMsg;
	}
	@Override
	public DemoMessage getDemoMessage() {
		return DemoMessageVOToDemoMessageConverter.convert(demoService.getFirstDemoMessageVO());
	}

}
