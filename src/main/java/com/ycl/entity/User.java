package com.ycl.entity;
/**
 * 用户类
 * 
 * @author yao
 * @date   2015年2月15日
 */
public class User {

	private String id;					//*主键
	private String loginname;			//*登陆名
	private String password;			//*密码
	private String salt;				//*盐值
	
	private String mobilePhone;			//手机号码
	private String email;				//邮箱
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
