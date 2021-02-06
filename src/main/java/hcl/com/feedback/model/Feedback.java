package hcl.com.feedback.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Feedback {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name ="id")
	int id;
	@Column(name="rating")
	int rating;
	@Column(name = "user")
	String user;
	@Column(name = "feedback")
	String feedback;
	

}
