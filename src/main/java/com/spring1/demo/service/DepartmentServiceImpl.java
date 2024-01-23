package com.spring1.demo.service;



import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring1.demo.entity.Department;
import com.spring1.demo.repository.DepartmentRepository;

/**
 * DepartmentServiceImpl
 */
@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public java.util.List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentbyId(Long departmentId) {
        return  departmentRepository.findById(departmentId).get();
    }   

    @Override
    public void deleteDepartmentbyId(Long departmentId) {
        departmentRepository.deleteById(departmentId);;
    }

    @Override
    public Department updateDepartment(Long departmentID, Department department) {
        Department depDb = departmentRepository.findById(departmentID).get();
        if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
            depDb.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            depDb.setDepartmentCode(department.getDepartmentCode());
        }

        if(Objects.nonNull(department.getDepartmenAddress()) && !"".equalsIgnoreCase(department.getDepartmenAddress())){
            depDb.setDepartmenAddress(department.getDepartmenAddress());
        }

        return departmentRepository.save(depDb);
    }

    

    
}