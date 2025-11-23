package com.voter.votergrievanceportal.model;

import com.voter.votergrievanceportal.ComplaintStatus;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "complaints")
public class Complaint {

    @Id
    private String complaintId;

    private String title;
    private String description;
    private String evidenceUrl;  // link to stored file (S3, local, etc.)

    private ComplaintStatus status;
    private String adminFeedback;

    private String citizenId;    // user reference

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
