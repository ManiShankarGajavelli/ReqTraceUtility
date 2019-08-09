/*
 * 
 */
package com.cnsi.reqtrace.model.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

// TODO: Auto-generated Javadoc
/**
 * The Class LookupMasterValue.
 */
/**
 * @author govindasamim
 * 
 * @version 3.0
 *
 */
@Entity(name = "RM_LOOKUP_VALUE")
public class LookupMasterValue {

	
	/** The value id. */
	@Id
    @Column(name = "LKP_VALUE_SID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long valueId;
	
	/** The value name. */
	@Column (name = "LKP_VALUE_NAME")
	public String valueName;
	
	/** The value desc. */
	@Column (name = "LKP_VALUE_DESC")
	public String valueDesc;
	
	/** The value code. */
	@Column (name = "LKP_VALUE_CODE")
	public String valueCode;
	
	/** The status. */
	@Column (name = "RECORD_STATUS")
	public String status;

	/** The lookup master. */
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="LKP_DOMAIN_CID")
    private LookupMaster lookupMaster;

	
	/**
	 * Gets the lookup master.
	 * 
	 * @return the lookup master
	 */
	public LookupMaster getLookupMaster() {
		return lookupMaster;
	}

	/**
	 * Sets the lookup master.
	 * 
	 * @param p_objLookupMaster
	 *            the new lookup master
	 */
	public void setLookupMaster(LookupMaster p_objLookupMaster) {
		this.lookupMaster = p_objLookupMaster;
	}

	/**
	 * Gets the value id.
	 * 
	 * @return the value id
	 */
	public long getValueId() {
		return valueId;
	}

	/**
	 * Sets the value id.
	 * 
	 * @param p_lValueId
	 *            the new value id
	 */
	public void setValueId(long p_lValueId) {
		this.valueId = p_lValueId;
	}

	/**
	 * Gets the value name.
	 * 
	 * @return the value name
	 */
	public String getValueName() {
		return valueName;
	}

	/**
	 * Sets the value name.
	 * 
	 * @param p_sValueName
	 *            the new value name
	 */
	public void setValueName(String p_sValueName) {
		this.valueName = p_sValueName;
	}

	/**
	 * Gets the value code.
	 * 
	 * @return the value code
	 */
	public String getValueCode() {
		return valueCode;
	}

	/**
	 * Sets the value code.
	 * 
	 * @param p_sValueCode
	 *            the new value code
	 */
	public void setValueCode(String p_sValueCode) {
		this.valueCode = p_sValueCode;
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
	 * Gets the value desc.
	 * 
	 * @return the value desc
	 */
	public String getValueDesc() {
		return valueDesc;
	}

	/**
	 * Sets the value desc.
	 * 
	 * @param p_sValueDesc
	 *            the new value desc
	 */
	public void setValueDesc(String p_sValueDesc) {
		this.valueDesc = p_sValueDesc;
	}
	
}
