package com.shan.camsystemtrial.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_subject_per_dep_batch_sem")
public class SubjectPerDepartmentBatchAndSemester {

    @Id
    @Column(name = "sdbs_id")
    private String sdbsId;

    @OneToOne
    @JoinColumn(
            name = "subjectId",
            referencedColumnName = "subject_id"
    )
    private Subject subjectId;

    @ManyToOne
    @JoinColumn(
            name = "departmentId",
            referencedColumnName = "department_id"
    )
    private Department departmentId;

    @ManyToOne
    @JoinColumn(
            name = "batchId",
            referencedColumnName = "batch_id"
    )
    private Batch batchId;

    @ManyToOne
    @JoinColumn(
            name = "semesterId",
            referencedColumnName = "semester_id"
    )
    private Semester semesterId;

}
