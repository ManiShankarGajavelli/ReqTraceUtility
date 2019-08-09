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
 * The Class DomainlookupValue.
 */
/**
 * @author govindasamim
 * 
 * @version 3.0
 *
 */
@Entity(name="rm_lookup_value")
public class DomainlookupValue {
	
	/** The value sid. */
	@Id
    @Column(name = "LKP_VALUE_SID", nullable = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RM_LOOKUP_VALUE_SEQ")
    @SequenceGenerator(name="RM_LOOKUP_VALUE_SEQ", sequenceName="RM_LOOKUP_VALUE_SEQ", allocationSize=100)
	private Long valueSid;

	
	/** The value_name. */
	@Column(name = "LKP_VALUE_NAME")
	private String value_name;
	
	/** The value_desc. */
	@Column(name = "LKP_VALUE_DESC")
	private String value_desc;
	
	/** The value_code. */
	@Column(name = "LKP_VALUE_CODE")
	private String value_code;
	
	/** The value_status. */
	@Column(name = "RECORD_STATUS")
	private String value_status;
	
	/** The domain cid. */
	@Column(name = "LKP_DOMAIN_CID")
	private Long domainCid;
	
 

    /** The created by. */
    @JoinColumn(name="CREATED_BY")
    private long createdBy;
    
    /** The modified by. */
    @JoinColumn(name="MODIFIED_by")
    private long modifiedBy;
    
    /** The created date. */
    @Column (name = "CREATED_DATE")
    private Date createdDate;
    
    /** The modified date. */
    @Column (name = "MODIFIED_DATE")
    private Date modifiedDate;
	
	/**
	 * Gets the value sid.
	 * 
	 * @return the value sid
	 */
	public Long getValueSid() {
		return valueSid;
	}
	
	/**
	 * Sets the value sid.
	 * 
	 * @param p_lValueSid
	 *            the new value sid
	 */
	public void setValueSid(Long p_lValueSid) {
		this.valueSid = p_lValueSid;
	}
	
	/**
	 * Gets the value_name.
	 * 
	 * @return the value_name
	 */
	public String getValue_name() {
		return value_name;
	}
	
	/**
	 * Sets the value_name.
	 * 
	 * @param p_sValueName
	 *            the new value_name
	 */
	public void setValue_name(String p_sValueName) {
		this.value_name = p_sValueName.trim();
	}
	
	/**
	 * Gets the value_desc.
	 * 
	 * @return the value_desc
	 */
	public String getValue_desc() {
		return value_desc;
	}
	
	/**
	 * Sets the value_desc.
	 * 
	 * @param p_sValueDesc
	 *            the new value_desc
	 */
	public void setValue_desc(String p_sValueDesc) {
		this.value_desc = p_sValueDesc!= null?p_sValueDesc.trim():p_sValueDesc;
	}
	
	/**
	 * Gets the value_code.
	 * 
	 * @return the value_code
	 */
	public String getValue_code() {
		return value_code;
	}
	
	/**
	 * Sets the value_code.
	 * 
	 * @param p_sValueCode
	 *            the new value_code
	 */
	public void setValue_code(String p_sValueCode) {
		this.value_code = p_sValueCode.trim();
	}
	
	/**
	 * Gets the value_status.
	 * 
	 * @return the value_status
	 */
	public String getValue_status() {
		return value_status;
	}
	
	/**
	 * Sets the value_status.
	 * 
	 * @param p_sValueStatus
	 *            the new value_status
	 */
	public void setValue_status(String p_sValueStatus) {
		this.value_status = p_sValueStatus;
	}
	
	/**
	 * Gets the domain cid.
	 * 
	 * @return the domain cid
	 */
	public Long getDomainCid() {
		return domainCid;
	}
	
	/**
	 * Sets the domain cid.
	 * 
	 * @param p_lDomainCid
	 *            the new domain cid
	 */
	public void setDomainCid(Long p_lDomainCid) {
		this.domainCid = p_lDomainCid;
	}
	
	/**
	 * Gets the created by.
	 * 
	 * @return the created by
	 */
	public long getCreatedBy() {
		return createdBy;
	}
	
	/**
	 * Sets the created by.
	 * 
	 * @param p_lCreatedBy
	 *            the new created by
	 */
	public void setCreatedBy(long p_lCreatedBy) {
		this.createdBy = p_lCreatedBy;
	}
	
	/**
	 * Gets the modified by.
	 * 
	 * @return the modified by
	 */
	public long getModifiedBy() {
		return modifiedBy;
	}
	
	/**
	 * Sets the modified by.
	 * 
	 * @param p_lModifiedBy
	 *            the new modified by
	 */
	public void setModifiedBy(long p_lModifiedBy) {
		this.modifiedBy = p_lModifiedBy;
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
    
    
    
}
