package com.shan.camsystemtrial.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_marks_and_review")
public class MarksAndReview {

    @Id
    @SequenceGenerator(name = "marksReviewSeq", sequenceName = "marksReviewSeq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marksReviewSeq")
    private Integer marksReviewId;

    @ManyToOne
    @JoinColumn(
            name = "usn",
            referencedColumnName = "usn"
    )
    private Student usn;

    @ManyToOne
    @JoinColumn(
            name = "sdbsId",
            referencedColumnName = "sdbs_id"
    )
    private SubjectPerDepartmentBatchAndSemester sdbsId;

    private String ia1Marks;

    private String ia1Attendance;

    private String ia1Review;

    private String ia2Marks;

    private String ia2Attendance;

    private String ia2Review;

    private String ia3Marks;

    private String ia3Attendance;

    private String ia3Review;

    private String finalMarks;

    private String finalAttendance;

    private String finalReview;

}
