package hcl.com.feedback.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hcl.com.feedback.repository.entity.FeedbackEntity;
import hcl.com.feedback.service.FeedbackService;



@RestController
@RequestMapping("feedback")
public class FeedbackController {

	@Autowired
	FeedbackService service;


	@PostMapping("/save")
	public String  saveUserFeedback( FeedbackEntity comment) {
		//print out on concole to track
		System.out.println("***---- "+ comment.toString());
		//save comment
		service.saveOrUpdate(comment);	
		int id=  comment.getId();
		// return all attribute of feedback
		return "Feedback saved in dabatbase" +service.getFeedbackById(id);
	}


	@GetMapping("/display/{id}")
	public Optional<FeedbackEntity> show(@PathVariable int id){
		Optional<FeedbackEntity> comment = Optional.ofNullable(service.getFeedbackById(id));
		return comment;
	}
}
