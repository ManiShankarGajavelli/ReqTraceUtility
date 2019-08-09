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
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;

// TODO: Auto-generated Javadoc
/**
 * The Class BusinessProcess.
 */
/**
 * @author govindasamim
 * 
 * @version 3.0
 *
 */
@Entity(name="rc_business_objectives")
public class BusinessProcess {
	
	/** The id. */
	@Id
	@Column(name = "BUSINESS_OBJECTIVE_SID", nullable = false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RC_BUSINESS_OBJECTIVES_SEQ")
	@SequenceGenerator(name="RC_BUSINESS_OBJECTIVES_SEQ", sequenceName="RC_BUSINESS_OBJECTIVES_SEQ", allocationSize=100)
	private Long id;
	
	/** The process id. */
	@Column(name = "BUSINESS_PROCESS_ID")
	private String processID;
	
	/** The objecttive. */
	@Column(name = "BUSINESS_OBJECTIVE_DESC")
	private String objecttive;
	
	/** The status. */
	@Column(name = "RECORD_STATUS")
	private String status ="A";
	
	/** The created by. */
	@Column(name = "CREATED_BY")
	private Long createdBy;
	
	/** The create date. */
	@Column(name = "CREATED_DATE")
	private Date createDate;
	
	/** The modified by. */
	@JoinColumn(name="MODIFIED_BY")
	private Long modifiedBy;
	
	/** The modified date. */
	@JoinColumn(name="MODIFIED_DATE")
	private Date modifiedDate;
	
	/** The comments. */
	@Column(name = "COMMENTS")
	private String comments;
	
	/** The work space id. */
	@Column(name = "WS_SID")
	private Long workSpaceID;
	
	/** The check list id. */
	@Column(name = "CHECKLIST_SID")
	private Long checkListID;

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public Long getId() {
		return  id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param p_lSid
	 *            the new id
	 */
	public void setId(Long p_lSid) {
		this.id = p_lSid;
	}

	/**
	 * Gets the process id.
	 * 
	 * @return the process id
	 */
	public String getProcessID() {
		return processID;
	}

	/**
	 * Sets the process id.
	 * 
	 * @param p_sProcessID
	 *            the new process id
	 */
	public void setProcessID(String p_sProcessID) {
		this.processID = p_sProcessID;
	}

	/**
	 * Gets the objecttive.
	 * 
	 * @return the objecttive
	 */
	public String getObjecttive() {
		return objecttive;
	}

	/**
	 * Sets the objecttive.
	 * 
	 * @param p_sObjecttive
	 *            the new objecttive
	 */
	public void setObjecttive(String p_sObjecttive) {
		this.objecttive = p_sObjecttive;
	}

	/**
	 * Gets the status.
	 * 
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 * 
	 * @param p_sStatus
	 *            the new status
	 */
	public void setStatus(String p_sStatus) {
		this.status = p_sStatus;
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

	/**
	 * Gets the modified by.
	 * 
	 * @return the modified by
	 */
	public Long getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * Sets the modified by.
	 * 
	 * @param p_lModifiedBy
	 *            the new modified by
	 */
	public void setModifiedBy(Long p_lModifiedBy) {
		this.modifiedBy = p_lModifiedBy;
	}

	/**
	 * Gets the modified date.
	 * 
	 * @return the modified date
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * Sets the modified date.
	 * 
	 * @param p_objModifiedDate
	 *            the new modified date
	 */
	public void setModifiedDate(Date p_objModifiedDate) {
		this.modifiedDate = p_objModifiedDate;
	}

	/**
	 * Gets the comments.
	 * 
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * Sets the comments.
	 * 
	 * @param p_sComments
	 *            the new comments
	 */
	public void setComments(String p_sComments) {
		this.comments = p_sComments;
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
	
	
	

}
