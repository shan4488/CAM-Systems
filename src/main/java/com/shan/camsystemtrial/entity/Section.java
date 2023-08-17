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
@Table(name = "tbl_section")
public class Section {

    @Id
    @Column(name = "section_id")
    private String sectionId;

    @Column(name = "section_name")
    private String sectionName;
}
