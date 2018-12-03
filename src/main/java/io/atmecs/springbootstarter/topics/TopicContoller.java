/**
 * 
 */
package io.atmecs.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ruchira.more
 *
 */

@RestController
public class TopicContoller {
	
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicservice.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")	//RequestMethod is enumaration and method is property of requestmapping
	public void addTopic(@RequestBody Topic topic) {
		topicservice.addTopic(topic);		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")	
	public void updateTopic(@PathVariable String id,@RequestBody Topic topic) {
		topicservice.updateTopic(id,topic);		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")	
	public void updateTopic(@PathVariable String id) {
		topicservice.deleteTopic(id);		
	}
	

}

















