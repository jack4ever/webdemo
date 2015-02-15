package com.ycl.entity;
/**
 * 角色类
 * 
 * @author yao
 * @date   2015年2月15日
 */
public class Role {

	private String id;				//*主键
	private String rolename;		//*角色名
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
	
}
