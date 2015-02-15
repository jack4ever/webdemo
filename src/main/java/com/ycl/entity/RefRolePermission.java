package com.ycl.entity;

/**
 * 角色权限对应类
 * @author yao
 * @date   2015年2月15日
 */
public class RefRolePermission {

	private String roleId;
	private String permission;
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	
}
