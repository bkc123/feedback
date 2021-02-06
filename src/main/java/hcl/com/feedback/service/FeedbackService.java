package hcl.com.feedback.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hcl.com.feedback.repository.entity.FeedbackCrudRepository;
import hcl.com.feedback.repository.entity.FeedbackEntity;

@Service
public class FeedbackService {
	
	@Autowired
	FeedbackCrudRepository fed;
	
	public void saveOrUpdate(FeedbackEntity comment) {
		fed.save(comment);
	}
	
	public void update(FeedbackEntity comment, int id ) {
		fed.save(comment);
	}
	
	public List<FeedbackEntity> findAllFeedback(){
		List<FeedbackEntity> comment= new ArrayList<FeedbackEntity>();
		fed.findAll().forEach(feedback1 -> comment.add(feedback1));
		return comment;
	}
	
	public FeedbackEntity getFeedbackById(int id) {
		return fed.findById(id).get();
	}

}
