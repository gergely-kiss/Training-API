package uk.gergely.kiss.trainingapi.demo;

import org.springframework.data.repository.CrudRepository;

import uk.gergely.kiss.trainingapi.model.DemoMessageVO;
/**
 * Repository service
 * @author kiss-
 *
 */
public interface DemoRepositoryService extends CrudRepository<DemoMessageVO, Integer> {

}
