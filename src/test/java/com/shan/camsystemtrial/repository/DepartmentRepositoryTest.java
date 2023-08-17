package com.shan.camsystemtrial.repository;

import com.shan.camsystemtrial.entity.Department;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setup(){
        Department department = Department.builder()
                .departmentId("DEP_01")
                .departmentLocation("Academic Block 3")
                .departmentName("CSE")
                .build();

        entityManager.persist(department);
    }

    @Test
    public void whenSaveDepartmentThenReturnSame(){
        Department department1 = Department.builder()
                .departmentId("DEP_01")
                .departmentLocation("Academic Block 3")
                .departmentName("CSE")
                .build();

        Department department2 = departmentRepository.save(department1);

        assertEquals(department2.getDepartmentId(), "DEP_01");
    }

}