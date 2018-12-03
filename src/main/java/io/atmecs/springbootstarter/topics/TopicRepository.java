/**
 * 
 */
package io.atmecs.springbootstarter.topics;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ruchira.more
 *
 */
@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {	//This is my data service
	
	//getAllTopics()
	// getTopic(String id)
	//updateTopic()
	//deleteTopic()
	
	
	// no need to create this class bez spring data JPA will provide you the logic for any entity class
	
	//crud repository have all this method ready to use for that CrudRepository<Topic, String> "Topic" is generic type of entity and "string" is 
	//priamry key ID

}
