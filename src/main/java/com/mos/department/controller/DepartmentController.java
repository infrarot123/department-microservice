package com.mos.department.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mos.department.entity.Department;
import com.mos.department.service.DepartmentService;


@RestController
@RequestMapping("/departments")
public class DepartmentController {

   private static final Logger _log = LoggerFactory.getLogger(DepartmentController.class);

   @Autowired
   private DepartmentService _departmentService;

   @GetMapping("/{id}")
   public Department findDepartmentById( @PathVariable("id") Long departmentId ) {
      _log.info("Inside findDepartmentById method of DepartmentController");
      return _departmentService.findDepartmentById(departmentId);
   }

   @PostMapping("/")
   public Department saveDepartment( @RequestBody Department department ) {
      _log.info("Inside saveDepartment method of DepartmentController");
      return _departmentService.saveDepartment(department);
   }
}
