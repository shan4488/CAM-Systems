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
@Table(name = "tbl_batch")
public class Batch {

    @Id
    @Column(name = "batch_id")   // B1923CS, B1923CV
    private String batchId;

    @Column(name = "batch_year")
    private String batchYear;

    @ManyToOne(
            cascade = CascadeType.REMOVE,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "departmentId",
            referencedColumnName = "department_id"
    )
    private Department departmentId;
}
