package com.shan.camsystemtrial.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_department")

public class Department {

    @Id
    @Column(name = "department_id")
    private String departmentId;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "department_location")
    private String departmentLocation;

    /* Bidirectional relation with batch is not required but let it be here if required

    @OneToMany(
            mappedBy = "departmentId"
    )

    private Batch batchId;

    ------------------------------------ */

}
