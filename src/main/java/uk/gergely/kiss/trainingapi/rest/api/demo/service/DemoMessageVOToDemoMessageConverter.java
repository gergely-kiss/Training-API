package uk.gergely.kiss.trainingapi.rest.api.demo.service;

import uk.gergely.kiss.trainingapi.model.demo.DemoMessageVO;

public class DemoMessageVOToDemoMessageConverter {
	
	public static DemoMessage convert (DemoMessageVO demoMessageVO) {
		DemoMessage demoMessage = new DemoMessage(demoMessageVO.getDemoMessage());
		return demoMessage;
	}
}
