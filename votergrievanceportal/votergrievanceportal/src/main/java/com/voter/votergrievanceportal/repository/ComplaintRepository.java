package com.voter.votergrievanceportal.repository;

import com.voter.votergrievanceportal.model.Complaint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplaintRepository extends MongoRepository<Complaint,String> {
}
