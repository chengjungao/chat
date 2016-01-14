
package com.chengjungao.chat.security.entity;
import java.sql.Date;


/**
 * 功能描述：dto
 * 
 * @author: 程军高
 * @date: 2016-01-14 16:54:07 
 */
public class resource{
	
	/**  */
	private int id;
	/** 资源编号 */
	private String resourceid;
	/** 资源名称 */
	private String resourcename;
	/** 资源url */
	private String resourceurl;
	/** 是否展示 */
	private String display;
	/** 上级编号 */
	private String parentid;
	
	/**
	 * @return the id
	 */
	
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the resourceid
	 */
	
	public String getResourceid() {
		return resourceid;
	}
	/**
	 * @param resourceid the resourceid to set
	 */
	public void setResourceid(String resourceid) {
		this.resourceid = resourceid;
	}
	/**
	 * @return the resourcename
	 */
	
	public String getResourcename() {
		return resourcename;
	}
	/**
	 * @param resourcename the resourcename to set
	 */
	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}
	/**
	 * @return the resourceurl
	 */
	
	public String getResourceurl() {
		return resourceurl;
	}
	/**
	 * @param resourceurl the resourceurl to set
	 */
	public void setResourceurl(String resourceurl) {
		this.resourceurl = resourceurl;
	}
	/**
	 * @return the display
	 */
	
	public String getDisplay() {
		return display;
	}
	/**
	 * @param display the display to set
	 */
	public void setDisplay(String display) {
		this.display = display;
	}
	/**
	 * @return the parentid
	 */
	
	public String getParentid() {
		return parentid;
	}
	/**
	 * @param parentid the parentid to set
	 */
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	
	

	

	
}
