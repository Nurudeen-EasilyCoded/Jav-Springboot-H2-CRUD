package com.example.apicrudoperation2.service;

import com.example.apicrudoperation2.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

   public List<Department> fetchDepartments();

   public Department fetchDepartmentById(Long departmentId);

   public void deleteDepartmentById(Long departmentId);

   public Department updateDepartmentById(Long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);
}
