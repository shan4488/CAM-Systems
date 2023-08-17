package com.shan.camsystemtrial.service;

import com.shan.camsystemtrial.entity.Department;
import org.springframework.stereotype.Component;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(String departmentId);

    String updateDepartment(String departmentId, Department department);

    String deleteDepartmentById(String departmentId);
}
