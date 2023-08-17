package com.shan.camsystemtrial.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_student")
public class Student {

    @Id
    @Column(name = "usn")
    private String usn;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

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
            name = "sectionId",
            referencedColumnName = "section_id"
    )
    private Section sectionId;

}
