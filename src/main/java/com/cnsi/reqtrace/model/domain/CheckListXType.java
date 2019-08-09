/*
 * 
 */
package com.cnsi.reqtrace.model.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

// TODO: Auto-generated Javadoc
/**
 * The Class CheckListXType.
 */
/**
 * @author govindasamim
 * 
 * @version 3.0
 *
 */
@Entity(name="RC_WS_X_CHK_TYPE")
public class CheckListXType {
	
	/** The sid. */
	@Id
	@Column(name = "WS_TYPE_SID", nullable = false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RC_WS_X_CHK_TYPE_SEQ")
	@SequenceGenerator(name="RC_WS_X_CHK_TYPE_SEQ", sequenceName="RC_WS_X_CHK_TYPE_SEQ", allocationSize=100)
	private Long sid;
	
	/** The check list id. */
	@Column(name = "CHK_TYPE_SID")
	private Long checkListID;

	/** The work space id. */
	@Column(name = "WS_SID")
	private Long workSpaceID;
	
	/** The created by. */
	@Column(name = "CREATE_BY")
	private Long createdBy;
	
	/** The create date. */
	@Column(name = "CREATED_DATE")
	private Date createDate;

	/**
	 * Gets the sid.
	 * 
	 * @return the sid
	 */
	public Long getSid() {
		return sid;
	}

	/**
	 * Sets the sid.
	 * 
	 * @param p_lSid
	 *            the new sid
	 */
	public void setSid(Long p_lSid) {
		this.sid = p_lSid;
	}

	/**
	 * Gets the check list id.
	 * 
	 * @return the check list id
	 */
	public Long getCheckListID() {
		return checkListID;
	}

	/**
	 * Sets the check list id.
	 * 
	 * @param p_lCheckListID
	 *            the new check list id
	 */
	public void setCheckListID(Long p_lCheckListID) {
		this.checkListID = p_lCheckListID;
	}

	/**
	 * Gets the work space id.
	 * 
	 * @return the work space id
	 */
	public Long getWorkSpaceID() {
		return workSpaceID;
	}

	/**
	 * Sets the work space id.
	 * 
	 * @param p_lWorkSpaceID
	 *            the new work space id
	 */
	public void setWorkSpaceID(Long p_lWorkSpaceID) {
		this.workSpaceID = p_lWorkSpaceID;
	}

	/**
	 * Gets the created by.
	 * 
	 * @return the created by
	 */
	public Long getCreatedBy() {
		return createdBy;
	}

	/**
	 * Sets the created by.
	 * 
	 * @param p_lCreatedBy
	 *            the new created by
	 */
	public void setCreatedBy(Long p_lCreatedBy) {
		this.createdBy = p_lCreatedBy;
	}

	/**
	 * Gets the creates the date.
	 * 
	 * @return the creates the date
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * Sets the creates the date.
	 * 
	 * @param p_objCreateDate
	 *            the new creates the date
	 */
	public void setCreateDate(Date p_objCreateDate) {
		this.createDate = p_objCreateDate;
	}

}
