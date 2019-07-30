package com.accp.dao;

import java.util.List;

import com.accp.pojo.Staff;

public interface StaffDao { 

	List<Staff> selectByDid(Integer did);
	
	int delete(Integer sid);
	
	Staff selectBySid(Integer sid);
	
}
