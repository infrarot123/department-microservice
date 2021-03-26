package com.mos.department.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mos.department.entity.Department;
import com.mos.department.repository.DepartmentRepository;


@Service
public class DepartmentService {

   private static final Logger _log = LoggerFactory.getLogger(DepartmentService.class);

   @Autowired
   private DepartmentRepository _departmentRepository;

   public Department findDepartmentById( Long departmentId ) {
      _log.info("Inside findDepartment of DepartmentService");
      return _departmentRepository.findByDepartmentId(departmentId);
   }

   public Department saveDepartment( Department department ) {
      _log.info("Inside saveDepartment of DepartmentService");
      return _departmentRepository.save(department);
   }
}
