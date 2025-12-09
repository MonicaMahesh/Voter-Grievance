package com.voter.votergrievanceportal.service;

import com.voter.votergrievanceportal.model.Complaint;
import com.voter.votergrievanceportal.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintService {

    @Autowired
    private ComplaintRepository complaintRepository;

    public List<Complaint> getallcomplaints() {
        return complaintRepository.findAll();
    }

    public Complaint raisecomplaint(Complaint complaint) {
        return complaintRepository.save(complaint);
    }
}
