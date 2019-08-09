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
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

// TODO: Auto-generated Javadoc
/**
 * The Class LookupMaster.
 */
/**
 * @author govindasamim
 * 
 * @version 3.0
 *
 */
@Entity(name = "RM_LOOKUP_DOMAIN")
public class LookupMaster {


	/** The domain id. */
	@Id
    @Column(name = "LKP_DOMAIN_CID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long domainId;
	
	/** The domain name. */
	@Column (name = "LKP_DOMAIN_NAME")
	public String domainName;
	
	/** The lookup master value list. */
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="LKP_DOMAIN_CID")
	@OrderBy("valueName")
    private List<LookupMasterValue> lookupMasterValueList;

	/**
	 * Gets the domain id.
	 * 
	 * @return the domain id
	 */
	public long getDomainId() {
		return domainId;
	}

	/**
	 * Sets the domain id.
	 * 
	 * @param p_lDomainId
	 *            the new domain id
	 */
	public void setDomainId(long p_lDomainId) {
		this.domainId = p_lDomainId;
	}

	/**
	 * Gets the domain name.
	 * 
	 * @return the domain name
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * Sets the domain name.
	 * 
	 * @param p_sDomainName
	 *            the new domain name
	 */
	public void setDomainName(String p_sDomainName) {
		this.domainName = p_sDomainName;
	}

	/**
	 * Gets the lookup master value list.
	 * 
	 * @return the lookup master value list
	 */
	public List<LookupMasterValue> getLookupMasterValueList() {
		return lookupMasterValueList;
	}

	/**
	 * Sets the lookup master value list.
	 * 
	 * @param p_lstLookupMasterValueList
	 *            the new lookup master value list
	 */
	public void setLookupMasterValueList(
			List<LookupMasterValue> p_lstLookupMasterValueList) {
		this.lookupMasterValueList = p_lstLookupMasterValueList;
	}

	
}
