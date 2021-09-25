package com.dazt.departmentmssc.controller;

import com.dazt.departmentmssc.entity.Department;
import com.dazt.departmentmssc.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping(value="/")
    public @ResponseBody Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController");
        return service.saveDepartment(department);
    }

    @GetMapping(value="/{id}")
    public @ResponseBody Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentController");
        return service.findDepartmentById(departmentId);
    }
}
