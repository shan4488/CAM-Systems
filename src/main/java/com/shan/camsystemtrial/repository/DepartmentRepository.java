package com.shan.camsystemtrial.repository;

import com.shan.camsystemtrial.entity.Department;
import com.shan.camsystemtrial.service.DepartmentService;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository <Department, Long> {

    @Query(
            value = "select * from tbl_department where department_id = ?1",
            nativeQuery = true
    )
    Department getByDepartmentId(String departmentId);

    @Modifying
    @Transactional
    @Query(
            value = "delete from tbl_department where department_id = ?1",
            nativeQuery = true
    )
    void deleteDepartmentById(String departmentId);
}
