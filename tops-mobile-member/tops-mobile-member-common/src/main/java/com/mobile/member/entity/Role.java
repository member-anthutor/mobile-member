package com.mobile.member.entity;

import java.util.List;

import com.mobile.member.common.vobase.AbstractVO;

/**
 * 角色
 */
public class Role extends AbstractVO {

	private static final long serialVersionUID = -2124313793015136785L;

	/** 角色名 */
	private String name;

	/** 权限 */
	private List<String> permissions;

	/** 角色所属部门，包括所有级别的所属部门 */
	private List<String> allDepartmentsKey;

	/** 角色的直属部门Key */
	private List<String> departmentKeys;

	/** 角色的描述 */
	private String description;

	/** 所属客户 */
	private String customerKey;

	private boolean isDefault;

	private boolean deleted;

	public Role() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

	public List<String> getAllDepartmentsKey() {
		return allDepartmentsKey;
	}

	public void setAllDepartmentsKey(List<String> allDepartmentsKey) {
		this.allDepartmentsKey = allDepartmentsKey;
	}

	public List<String> getDepartmentKeys() {
		return departmentKeys;
	}

	public void setDepartmentKeys(List<String> departmentKeys) {
		this.departmentKeys = departmentKeys;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getCustomerKey() {
		return customerKey;
	}

	public void setCustomerKey(String customerKey) {
		this.customerKey = customerKey;
	}

	public boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	@Override
	public String toString() {
		return "Role [name=" + name + ", permissions=" + permissions + ", departmentKeys=" + departmentKeys
				+ ", customerKey=" + customerKey + ", getKey()=" + getKey() + "]";
	}

}
