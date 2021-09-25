package com.dazt.departmentmssc.service;

import com.dazt.departmentmssc.entity.Department;
import com.dazt.departmentmssc.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService");
        return repository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findByDepartmentId method of DepartmentService");
        return repository.findByDepartmentId(departmentId);
    }
}
