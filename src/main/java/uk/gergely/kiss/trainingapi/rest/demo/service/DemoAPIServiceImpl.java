package uk.gergely.kiss.trainingapi.rest.demo.service;

import org.springframework.stereotype.Service;

import uk.gergely.kiss.trainingapi.restresources.APIMessageResources;

/**
 * DemoAPIService Implementation
 */
@Service
public class DemoAPIServiceImpl implements DemoAPIService {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getDemoMessage() {
		LOGGER.info("getDemoMessage was called");
		return APIMessageResources.DEMO_MSG;
	}

}
