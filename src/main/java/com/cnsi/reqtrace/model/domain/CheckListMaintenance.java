package com.cnsi.reqtrace.model.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 * The Class CheckListMaintenance.
 */
/**
 * @author govindasamim
 * 
 * @version 3.0
 *
 */
@Entity(name = "RC_CHECKLIST_MASTER")
public class CheckListMaintenance {

	/** The check list id. */
	@Id
	@Column(name = "CHECKLIST_SID", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RC_CHECKLIST_MASTER_SEQ")
	@SequenceGenerator(name = "RC_CHECKLIST_MASTER_SEQ", sequenceName = "RC_CHECKLIST_MASTER_SEQ", allocationSize = 100)
	private long checkListID;

	/** The Descripiton. */
	@Column(name = "CHECKLIST_DESC", columnDefinition = "LONGTEXT", length = 20000)
	private String Descripiton;

	/** The check list number. */
	@Column(name = "CHECKLIST_NUM", nullable = false)
	private String checkListNumber;

	/** The record status. */
	@Column(name = "RECORD_STATUS", nullable = false)
	private String recordStatus;

	/** The work space id. */
	@Column(name = "WS_SID", nullable = false)
	private long workSpaceId;

	@Column(name = "CREATED_BY")
	private String createdBy;

	/** The modified by. */

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	/** The created date. */
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	/** The modified date. */
	@Column(name = "MODIFIED_DATE")
	private Date modifiedDate;

	/** The comments. */
	@Column(name = "COMMENTS")
	private String comments;

	/** The check list type. */
	@Column(name = "CHK_TYPE_SID")
	private long checkListType;

	/** The business area id. */
	@Column(name = "BUSINESS_AREA")
	private long businessAreaId;

	/**
	 * Gets the check list id.
	 * 
	 * @return the check list id
	 */
	public long getCheckListID() {
		return checkListID;
	}

	/**
	 * Sets the check list id.
	 * 
	 * @param p_lCheckListID
	 *            the new check list id
	 */
	public void setCheckListID(long p_lCheckListID) {
		this.checkListID = p_lCheckListID;
	}

	/**
	 * Gets the descripiton.
	 * 
	 * @return the descripiton
	 */
	public String getDescripiton() {
		return Descripiton;
	}

	/**
	 * Sets the descripiton.
	 * 
	 * @param p_sDescripiton
	 *            the new descripiton
	 */
	public void setDescripiton(String p_sDescripiton) {
		Descripiton = p_sDescripiton;
	}

	/**
	 * Gets the check list number.
	 * 
	 * @return the check list number
	 */
	public String getCheckListNumber() {
		return checkListNumber;
	}

	/**
	 * Sets the check list number.
	 * 
	 * @param p_sCheckListNumber
	 *            the new check list number
	 */
	public void setCheckListNumber(String p_sCheckListNumber) {
		this.checkListNumber = p_sCheckListNumber;
	}

	/**
	 * Gets the work space id.
	 * 
	 * @return the work space id
	 */
	public long getWorkSpaceId() {
		return workSpaceId;
	}

	/**
	 * Sets the work space id.
	 * 
	 * @param p_lWorkSpaceId
	 *            the new work space id
	 */
	public void setWorkSpaceId(long p_lWorkSpaceId) {
		this.workSpaceId = p_lWorkSpaceId;
	}

	/**
	 * Gets the created by.
	 * 
	 * @return the created by
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * Sets the created by.
	 * 
	 * @param p_objCreatedBy
	 *            the new created by
	 */
	public void setCreatedBy(String p_objCreatedBy) {
		this.createdBy = p_objCreatedBy;
	}

	/**
	 * Gets the modified by.
	 * 
	 * @return the modified by
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * Sets the modified by.
	 * 
	 * @param p_objModifiedBy
	 *            the new modified by
	 */
	public void setModifiedBy(String p_objModifiedBy) {
		this.modifiedBy = p_objModifiedBy;
	}

	/**
	 * Gets the created date.
	 * 
	 * @return the created date
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the created date.
	 * 
	 * @param p_objCreatedDate
	 *            the new created date
	 */
	public void setCreatedDate(Date p_objCreatedDate) {
		this.createdDate = p_objCreatedDate;
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
	 * Gets the record status.
	 * 
	 * @return the record status
	 */
	public String getRecordStatus() {
		return recordStatus;
	}

	/**
	 * Sets the record status.
	 * 
	 * @param p_sRecordStatus
	 *            the new record status
	 */
	public void setRecordStatus(String p_sRecordStatus) {
		this.recordStatus = p_sRecordStatus;
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
	 * Gets the check list type.
	 * 
	 * @return the check list type
	 */
	public long getCheckListType() {
		return checkListType;
	}

	/**
	 * Sets the check list type.
	 * 
	 * @param p_lCheckListType
	 *            the new check list type
	 */
	public void setCheckListType(long p_lCheckListType) {
		this.checkListType = p_lCheckListType;
	}

	/**
	 * Gets the business area id.
	 * 
	 * @return the business area id
	 */
	public long getBusinessAreaId() {
		return businessAreaId;
	}

	/**
	 * Sets the business area id.
	 * 
	 * @param p_lBusinessAreaId
	 *            the new business area id
	 */
	public void setBusinessAreaId(long p_lBusinessAreaId) {
		this.businessAreaId = p_lBusinessAreaId;
	}

}