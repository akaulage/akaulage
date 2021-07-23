package com.example.demo.Service;

import com.example.demo.Entity.Department;
import com.example.demo.Repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentRepo departmentRepo;

    @Override
    public Department saveDepartment(Department dept) {
        return departmentRepo.save(dept);
    }
}
