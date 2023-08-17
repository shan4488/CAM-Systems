package com.shan.camsystemtrial.controller;

import com.shan.camsystemtrial.entity.Department;
import com.shan.camsystemtrial.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setup(){
        department = Department.builder()
                .departmentId("DEP_01")
                .departmentName("Computer Science Engineering")
                .departmentLocation("Academic Block 3")
                .build();
    }

    @Test
    void saveDepartment() throws Exception {
        Department inputDepartment = Department.builder()
                .departmentId("DEP_01")
                .departmentName("Computer Science Engineering")
                .departmentLocation("Academic Block 3")
                .build();

        Mockito.when(departmentService.saveDepartment(inputDepartment))
                .thenReturn(department);

        mockMvc.perform(post("/department")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "    \"departmentId\": \"DEP_01\",\n" +
                        "    \"departmentName\": \"Computer Science Engineering\",\n" +
                        "    \"departmentLocation\": \"Academic Block 3\"\n" +
                        "}")).andExpect(status().isOk());
    }

}