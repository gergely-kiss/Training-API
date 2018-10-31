package uk.gergely.kiss.trainingapi.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gergely.kiss.trainingapi.model.DemoMessageVO;
import uk.gergely.kiss.trainingapi.restresources.APIMessageResources;

/**
 * {@inheritDoc}
 */
@Service
public class DemoServiceImpl implements DemoService{

	@Autowired
	private DemoRepositoryService demoRepService;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getMessageFromDemoMessage() {
		LOGGER.info("getMessageFromDemoMessage was called");
		List<DemoMessageVO> demoMessageVOList = new ArrayList<>();
		LOGGER.info(demoRepService.findAll().toString());
		demoRepService.findAll().forEach(demoMessageVOList::add);
		if(demoMessageVOList.size() < 1) {
			LOGGER.info(" No message found creating default DemoMessageVO");
			DemoMessageVO demoMessageVO = new DemoMessageVO(APIMessageResources.DEFAULT_DEMO_MSG);
			DemoMessageVO savedDemoMessageVO = demoRepService.save(demoMessageVO);
			LOGGER.info("Succesfully saved: "+savedDemoMessageVO);
		}
		if(demoMessageVOList.size() > 1) {
			LOGGER.warning("More than one Demo Message found. Returning the first. The messages are: " + demoMessageVOList);
		}
		demoRepService.findAll().forEach(demoMessageVOList::add);
		DemoMessageVO demoMessageVO = demoMessageVOList.get(0);
		LOGGER.info("DemoMessage: "+demoMessageVO);
		return demoMessageVO.getMessage();
	}

}
