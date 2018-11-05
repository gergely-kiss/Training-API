package uk.gergely.kiss.trainingapi.demo;

import java.util.logging.Logger;

import uk.gergely.kiss.trainingapi.model.demo.DemoMessageVO;
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
	/**
	 * Getting the first DemoMessageVO.
	 * @return DemoMessageVO 
	 */
	public DemoMessageVO getFirstDemoMessageVO();
}
