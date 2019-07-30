package com.accp.dao;

import java.util.List;

import com.accp.pojo.Department;

public interface DepartmentDao {
	
	List<Department> selectAll();
}
