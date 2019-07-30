package com.accp.action;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.accp.biz.StaffBiz;
import com.accp.pojo.Department;
import com.accp.pojo.Staff;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/c") // 命名空间
public class CAction {

	@Autowired
	private StaffBiz biz;

	@GetMapping("departments")
	public List<Department> selectAll() {
		return biz.selectAll();
	}
	
	@GetMapping("staffs")
	public List<Staff> selectAll2(Integer did) {
		return biz.selectBydid(did);
	}
	
	
	@DeleteMapping("staffs/staff")
	public Map<String,String> selectAll22(Integer sid) {
		Map<String,String> message=new HashMap<String,String>();
		
		Staff staff=biz.selectBySid(sid);
		
		int count1=biz.delete(sid);
		
		int count2=biz.selectBydid(staff.getDid()).size();
		
		if(count1!=0) {
			message.put("code","删除成功！");
			message.put("msg",count2+"");
		}else {
			message.put("code","删除失败!");
			message.put("msg",0+"");
		}
		return message;
	}
	

}
