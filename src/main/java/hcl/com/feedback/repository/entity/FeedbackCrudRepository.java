package hcl.com.feedback.repository.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackCrudRepository extends CrudRepository<FeedbackEntity, Integer>{

}
