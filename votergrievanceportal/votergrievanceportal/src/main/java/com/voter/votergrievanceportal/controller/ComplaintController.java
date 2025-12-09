package com.voter.votergrievanceportal.controller;

import com.voter.votergrievanceportal.model.Complaint;
import com.voter.votergrievanceportal.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComplaintController {

    @Autowired
    private ComplaintService complaintservice;

//    1) user/my-complaints get call
    @GetMapping("/complaints")
    public ResponseEntity<List<Complaint>> getAllComplaint(){
        return new ResponseEntity<>(complaintservice.getallcomplaints(), HttpStatus.OK);
    }
//2) user/raise-complaint post call
    @PostMapping("/raisecomplaint")
    public ResponseEntity<Complaint> raiseComplaint(@RequestBody Complaint complaint){
        return new ResponseEntity<>(complaintservice.raisecomplaint(complaint),HttpStatus.OK);
    }
//3) admin/allcomplaints - get
//4) admin/getcomplaint/{id} - put


}
