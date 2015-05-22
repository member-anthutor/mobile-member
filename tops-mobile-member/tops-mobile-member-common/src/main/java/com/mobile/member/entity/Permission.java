package com.mobile.member.entity;

import com.mobile.member.common.vobase.AbstractVO;
import com.mobile.member.enums.Platform;

/**
 * 权限
 */
public class Permission extends AbstractVO {

	private static final long serialVersionUID = -617411872354860402L;

	/** 权限名 */
	private String name;

	/** 权限对应网址 */
	private String url;

	private Platform platform;
	
	private String parent;

	private String text;
	
	private int order;
	
	public Permission() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
	@Override
	public String toString() {
		return "Permission [name=" + name + ", url=" + url + ", platform=" + platform +", parent="
				+ parent + ", text=" + text + ", getKey()=" + getKey() + "]";
	}

}
