package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.DepartmentDao;
import com.accp.dao.StaffDao;
import com.accp.pojo.Department;
import com.accp.pojo.Staff;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class StaffBiz {

	@Autowired
	private StaffDao dao1;
	
	@Autowired
	private DepartmentDao dao2;

	public List<Staff> selectBydid(Integer did){
		return dao1.selectByDid(did);
	}
	
	public Staff selectBySid(Integer sid) {
		return dao1.selectBySid(sid);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delete(Integer sid) {
		return dao1.delete(sid);
	}
	
	public List<Department> selectAll(){
		return dao2.selectAll();
	}
}
