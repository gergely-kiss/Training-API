package uk.gergely.kiss.trainingapi.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gergely.kiss.trainingapi.model.demo.DemoMessageVO;
import uk.gergely.kiss.trainingapi.repository.demo.DemoMessageRepository;
import uk.gergely.kiss.trainingapi.rest.api.resources.APIMessageResources;

/**
 * {@inheritDoc}
 */
@Service
public class DemoServiceImpl implements DemoService{

	
    @Autowired
    private DemoMessageRepository demoMessageRepository;
	
	/**
	 * {@inheritDoc}
	 */
    @Override
    public String getMessageFromDemoMessage() {
        return demoMessageRepository.getDemoMessageVOList().get(0).getDemoMessage();
    }

}
