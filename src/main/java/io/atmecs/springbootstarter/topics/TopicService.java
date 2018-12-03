/**
 * 
 */
package io.atmecs.springbootstarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ruchira.more
 *
 */

@Service
public class TopicService {				// service is singleton : Used to write business service
	
	@Autowired
	private TopicRepository topicrepository;
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring Framework","Description of SpringFramework"),
			new Topic("Java","Core JAVA","Description of Core JAVA"),
			new Topic("Javascript","Javascript Framework","Description of Javascript")));
	
	public List<Topic> getAllTopics(){
		List<Topic> topics=new ArrayList<>();
		topicrepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicrepository.save(topic);
	//	topics.add(topic);
	}

	public void updateTopic(String id,Topic topic) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
			
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.remove(i);
				return;
			}
		}
	}


}
