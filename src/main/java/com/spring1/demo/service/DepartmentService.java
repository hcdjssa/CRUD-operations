package com.spring1.demo.service;



import org.springframework.stereotype.Service;

import com.spring1.demo.entity.Department;

@Service
public interface DepartmentService {

    public Department saveDepartment(Department department);

    public java.util.List<Department> fetchDepartmentList();

    public Department fetchDepartmentbyId(Long departmentId);

    public void deleteDepartmentbyId(Long departmentId);

    public Department updateDepartment(Long departmentID, Department department);

    
    
}
