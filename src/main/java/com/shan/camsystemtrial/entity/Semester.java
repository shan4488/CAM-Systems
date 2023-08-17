package com.shan.camsystemtrial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_semester")
public class Semester {

    @Id
    @Column(name = "semester_id")
    private Integer semesterId;

    @Column(name = "semester_description")
    private String semesterDescription;
}
