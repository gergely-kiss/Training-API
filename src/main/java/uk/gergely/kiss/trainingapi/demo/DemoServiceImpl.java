package uk.gergely.kiss.trainingapi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gergely.kiss.trainingapi.model.demo.DemoMessageVO;
import uk.gergely.kiss.trainingapi.repository.demo.DemoMessageRepository;


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
    
    /**
	 * {@inheritDoc}
	 */
	@Override
	public DemoMessageVO getFirstDemoMessageVO() {
		return demoMessageRepository.getDemoMessageVOList().get(0);
	}

}
