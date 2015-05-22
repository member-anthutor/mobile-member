package com.mobile.member.entity;


import java.util.List;

import com.mobile.member.common.vobase.AbstractVO;
import com.mobile.member.enums.UserStatus;

public class User extends AbstractVO {

	private static final long serialVersionUID = 2315549220411343191L;

	/** 用户名，用于登录系统 */
	private String username;

	/** 密码 */
	private String password;

	/** 用户状态 */
	private UserStatus status;

	/** 是否已登录，用于“记住登录”功能 */
	private Boolean signedIn; /**

	/** 用户所属的角色 */
	private List<String> rolesKey;
	
   /** 除了角色拥有的权限之外，额外添加的权限 */
   private List<String> additionalPermissions;

   /** 从角色拥有的权限当中，特意剥夺的权限 */
   private List<String> bereftPermissions;
   
	/** 随机生成的安全代码，用于找回密码 */
	private String securityCode;

	/** 备注 */
	private String remark;
	
   /** 加密串*/
   private String salt;
	
	public User() {}
	

   public String getUsername() {
      return username;
   }


   public String getPassword() {
      return password;
   }


   public UserStatus getStatus() {
      return status;
   }


   public Boolean getSignedIn() {
      return signedIn;
   }


   public List<String> getRolesKey() {
      return rolesKey;
   }


   public List<String> getAdditionalPermissions() {
      return additionalPermissions;
   }


   public List<String> getBereftPermissions() {
      return bereftPermissions;
   }


   public String getSecurityCode() {
      return securityCode;
   }


   public String getRemark() {
      return remark;
   }


   public String getSalt() {
      return salt;
   }


   public void setUsername(String username) {
      this.username = username;
   }


   public void setPassword(String password) {
      this.password = password;
   }


   public void setStatus(UserStatus status) {
      this.status = status;
   }


   public void setSignedIn(Boolean signedIn) {
      this.signedIn = signedIn;
   }


   public void setRolesKey(List<String> rolesKey) {
      this.rolesKey = rolesKey;
   }


   public void setAdditionalPermissions(List<String> additionalPermissions) {
      this.additionalPermissions = additionalPermissions;
   }


   public void setBereftPermissions(List<String> bereftPermissions) {
      this.bereftPermissions = bereftPermissions;
   }


   public void setSecurityCode(String securityCode) {
      this.securityCode = securityCode;
   }


   public void setRemark(String remark) {
      this.remark = remark;
   }


   public void setSalt(String salt) {
      this.salt = salt;
   }


   @Override
	public String toString() {
		return "User [username=" + username+", getKey()="
				+ getKey() + "]" + ", createTime=" + getCreateTime();
	}

}
