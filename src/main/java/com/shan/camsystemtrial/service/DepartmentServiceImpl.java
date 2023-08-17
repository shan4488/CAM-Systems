package com.shan.camsystemtrial.service;

import com.shan.camsystemtrial.entity.Department;
import com.shan.camsystemtrial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(String departmentId) {
        String departmentIdIgnoreCase = departmentId.toUpperCase(); // Ignores any case mistakes and tranforms into uppercase by default
        return departmentRepository.getByDepartmentId(departmentIdIgnoreCase);
    }

    @Override
    public String updateDepartment(String departmentId,Department department) {
        Department departmentDb = departmentRepository.getByDepartmentId(departmentId.toUpperCase());
        String updateStatusMessage = " Update Successful!";
        if (!"".equalsIgnoreCase(department.getDepartmentName()) && !departmentDb.getDepartmentName().equalsIgnoreCase(department.getDepartmentName())){
            departmentDb.setDepartmentName(department.getDepartmentName());
        }else{
            updateStatusMessage = updateStatusMessage + "Department Name: No";
        }

        if (!"".equalsIgnoreCase(department.getDepartmentLocation()) && !departmentDb.getDepartmentLocation().equalsIgnoreCase(department.getDepartmentLocation())){
            departmentDb.setDepartmentLocation(department.getDepartmentLocation());
        }else{
            updateStatusMessage = updateStatusMessage + "Department Location: No";
        }

        departmentRepository.save(departmentDb);

        return updateStatusMessage;
    }

    @Override
    public String deleteDepartmentById(String departmentId) {
        departmentRepository.deleteDepartmentById(departmentId);
        return "Deleted department with id: " + departmentId + " successfully";
    }
}
