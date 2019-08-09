/*
 * 
 */
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

// TODO: Auto-generated Javadoc
/**
 * The Class CheckListCriteria.
 */
/**
 * @author govindasamim
 * 
 * @version 3.0
 *
 */
@Entity(name = "RC_CRITERIA")
public class CheckListCriteria {
	
	
	/** The criteria id. */
	@Id
    @Column(name = "CRITERIA_SID", nullable = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RC_CRITERIA_SEQ")
    @SequenceGenerator(name="RC_CRITERIA_SEQ", sequenceName="RC_CRITERIA_SEQ", allocationSize=100)
    private long criteriaID;
 
    /** The criteria name. */
    @Column (name = "CRITERIA_NAME", nullable = false)
    private String criteriaName;
    
   
    
    /** The created by. */

    @Column(name="CREATED_BY")
    private String createdBy;

    /** The modified by. */
    @Column(name="MODIFIED_BY")
    private String modifiedBy;
    
    /** The created date. */
    @Column (name = "CREATED_DATE")
    private Date createdDate;

    /** The modified date. */
    @Column (name = "MODIFIED_DATE")
    private Date modifiedDate;
    
    /** The check list sid. */
    @Column (name = "CHECKLIST_SID")
    private long checkListSid;
    
    /** The criteria number. */
    @Column (name = "CRITERIA_NUM")
    private String criteriaNumber;
    
    /** The comments. */
    @Column (name = "COMMENTS")
    private String comments;
    
    /** The description. */
    @Column (name = "CRITERIA_DESC")
    private String description;
    
    /** The record status. */
    @Column (name = "record_status")
    private String recordStatus = "A";
    
    /** The source. */
    @Column (name = "criteria_source")
    private long source;
    
    /** The work space id. */
    @Column (name = "WS_SID", nullable = false)
    private long workSpaceId;
    
    
    /** The business objectives id. */
    @Column (name = "business_process_id", nullable = false)
    private String businessObjectivesId;
  

	/**
	 * Gets the source.
	 * 
	 * @return the source
	 */
	public long getSource() {
		return source;
	}

	/**
	 * Sets the source.
	 * 
	 * @param p_lSource
	 *            the new source
	 */
	public void setSource(long p_lSource) {
		this.source = p_lSource;
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
	 * Gets the criteria id.
	 * 
	 * @return the criteria id
	 */
	public long getCriteriaID() {
		return criteriaID;
	}

	/**
	 * Sets the criteria id.
	 * 
	 * @param p_lCriteriaID
	 *            the new criteria id
	 */
	public void setCriteriaID(long p_lCriteriaID) {
		this.criteriaID = p_lCriteriaID;
	}

	/**
	 * Gets the criteria name.
	 * 
	 * @return the criteria name
	 */
	public String getCriteriaName() {
		return criteriaName;
	}

	/**
	 * Sets the criteria name.
	 * 
	 * @param p_sCriteriaName
	 *            the new criteria name
	 */
	public void setCriteriaName(String p_sCriteriaName) {
		this.criteriaName = p_sCriteriaName;
	}

	/**
	 * Gets the check list sid.
	 * 
	 * @return the check list sid
	 */
	public long getCheckListSid() {
		return checkListSid;
	}

	/**
	 * Sets the check list sid.
	 * 
	 * @param p_lCheckListSid
	 *            the new check list sid
	 */
	public void setCheckListSid(long p_lCheckListSid) {
		this.checkListSid = p_lCheckListSid;
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
	 * Gets the criteria number.
	 * 
	 * @return the criteria number
	 */
	public String getCriteriaNumber() {
		return criteriaNumber;
	}

	/**
	 * Sets the criteria number.
	 * 
	 * @param p_sCriteriaNumber
	 *            the new criteria number
	 */
	public void setCriteriaNumber(String p_sCriteriaNumber) {
		this.criteriaNumber = p_sCriteriaNumber;
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
	 * Gets the description.
	 * 
	 * @return the description
	 */
	public String getDescription(){
		return description;
	}

	/**
	 * Sets the description.
	 * 
	 * @param p_sDescription
	 *            the new description
	 */
	public void setDescription(String p_sDescription){
		this.description = p_sDescription;
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
	 * Gets the business objectives id.
	 * 
	 * @return the business objectives id
	 */
	public String getBusinessObjectivesId() {
		return businessObjectivesId;
	}

	/**
	 * Sets the business objectives id.
	 * 
	 * @param p_sBusinessObjectivesId
	 *            the new business objectives id
	 */
	public void setBusinessObjectivesId(String p_sBusinessObjectivesId) {
		this.businessObjectivesId = p_sBusinessObjectivesId;
	}
	
}