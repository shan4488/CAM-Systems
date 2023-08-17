package com.shan.camsystemtrial.controller;

import com.shan.camsystemtrial.entity.Department;
import com.shan.camsystemtrial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
//@RequestMapping("/api/v1/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/department")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }
    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department/{id}")
    public Department fetchDepartmentById(@PathVariable("id") String departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @PutMapping("department/{id}")
    public String updateDepartment(@PathVariable("id") String departmentId, @RequestBody Department department){
        String updateStatusMessage = departmentService.updateDepartment(departmentId, department);
        return updateStatusMessage;
    }

    @DeleteMapping("department/{id}")
    public String deleteDepartmentById(@PathVariable("id") String departmentId){
        String deleteStatusMessage = departmentService.deleteDepartmentById(departmentId);
        return deleteStatusMessage;
    }
}
