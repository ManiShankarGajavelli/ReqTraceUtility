/*
 * 
 */
package com.cnsi.reqtrace.model.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomAttribite.
 */
/**
 * @author govindasamim
 * 
 * @version 3.0
 *
 */
@Entity(name = "RM_CUSTOM_ATTRIBUTES")
public class CustomAttribite {
	
	/** The attribure id. */
	@Id
    @Column(name = "ATT_CID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="RM_CUSTOM_ATTRIBUTES_SEQ")
	@SequenceGenerator(name="RM_CUSTOM_ATTRIBUTES_SEQ", sequenceName="RM_CUSTOM_ATTRIBUTES_SEQ", allocationSize=100)
	public long attribureId;
	
	/** The attribite display name. */
	@Column (name = "ATT_DISPLAY_NAME")
	public String attribiteDisplayName;
	
	/** The attribute length. */
	@Column (name = "ATT_LENGTH")
	public BigDecimal attributeLength;
	
	/** The attribute type. */
	@Column (name = "ATT_TYPE")
	public String attributeType;
	
	/** The attribute name. */
	@Column (name = "ATT_NAME")
	public String attributeName;
	
	/** The attribute description. */
	@Column (name = "ATT_DESC")
	public String attributeDescription;

	/** The lookup domain cid. */
	@Column (name = "LKP_DOMAIN_CID")
	public Long lookupDomainCid;
	
	/** The created date. */
	@Column (name = "CREATED_DATE")
	private Date createdDate;
	    
	/** The modified date. */
	@Column (name = "MODIFIED_DATE")
	private Date modifiedDate;
	
	/** The custom attributes code. */
	@Column (name = "ATT_CODE") 
	private String customAttributesCode;
	
	
	/** The created by. */
	@JoinColumn(name="CREATED_BY")
	private String createdBy;

	/** The modified by. */
	@JoinColumn(name="MODIFIED_BY")
	private String modifiedBy;

	/** The work space. */
	@OneToMany(mappedBy="customAttribute")
	 private List<WorkspaceCustomAttribute> workSpace;

	
	
	/**
	 * Gets the work space.
	 * 
	 * @return the work space
	 */
	public List<WorkspaceCustomAttribute> getWorkSpace() {
		return workSpace;
	}
	
	/**
	 * Sets the work space.
	 * 
	 * @param p_lstWorkSpace
	 *            the new work space
	 */
	public void setWorkSpace(List<WorkspaceCustomAttribute> p_lstWorkSpace) {
		this.workSpace = p_lstWorkSpace;
	}
	
	/**
	 * Gets the attribure id.
	 * 
	 * @return the attribure id
	 */
	public long getAttribureId() {
		return attribureId;
	}
	
	/**
	 * Sets the attribure id.
	 * 
	 * @param p_lAttribureId
	 *            the new attribure id
	 */
	public void setAttribureId(long p_lAttribureId) {
		this.attribureId = p_lAttribureId;
	}
	
	/**
	 * Gets the attribite display name.
	 * 
	 * @return the attribite display name
	 */
	public String getAttribiteDisplayName() {
		return attribiteDisplayName;
	}
	
	/**
	 * Sets the attribite display name.
	 * 
	 * @param p_sAttribiteDisplayName
	 *            the new attribite display name
	 */
	public void setAttribiteDisplayName(String p_sAttribiteDisplayName) {
		this.attribiteDisplayName = p_sAttribiteDisplayName;
	}
	
	/**
	 * Gets the attribute length.
	 * 
	 * @return the attribute length
	 */
	public BigDecimal getAttributeLength() {
		return attributeLength;
	}
	
	/**
	 * Sets the attribute length.
	 * 
	 * @param p_objAttributeLength
	 *            the new attribute length
	 */
	public void setAttributeLength(BigDecimal p_objAttributeLength) {
		this.attributeLength = p_objAttributeLength;
	}
	
	/**
	 * Gets the attribute type.
	 * 
	 * @return the attribute type
	 */
	public String getAttributeType() {
		return attributeType;
	}
	
	/**
	 * Sets the attribute type.
	 * 
	 * @param p_sAttributeType
	 *            the new attribute type
	 */
	public void setAttributeType(String p_sAttributeType) {
		this.attributeType = p_sAttributeType;
	}
	
	/**
	 * Gets the lookup domain cid.
	 * 
	 * @return the lookup domain cid
	 */
	public Long getLookupDomainCid() {
		return lookupDomainCid;
	}
	
	/**
	 * Sets the lookup domain cid.
	 * 
	 * @param p_lLookupDomainCid
	 *            the new lookup domain cid
	 */
	public void setLookupDomainCid(Long p_lLookupDomainCid) {
		this.lookupDomainCid = p_lLookupDomainCid;
	}
	
	/**
	 * Gets the attribute name.
	 * 
	 * @return the attribute name
	 */
	public String getAttributeName() {
		return attributeName;
	}
	
	/**
	 * Sets the attribute name.
	 * 
	 * @param p_sAttributeName
	 *            the new attribute name
	 */
	public void setAttributeName(String p_sAttributeName) {
		this.attributeName = p_sAttributeName;
	}
	
	/**
	 * Gets the attribute description.
	 * 
	 * @return the attribute description
	 */
	public String getAttributeDescription() {
		return attributeDescription;
	}
	
	/**
	 * Sets the attribute description.
	 * 
	 * @param p_sAttributeDescription
	 *            the new attribute description
	 */
	public void setAttributeDescription(String p_sAttributeDescription) {
		this.attributeDescription = p_sAttributeDescription;
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
	 * Gets the custom attributes code.
	 * 
	 * @return the custom attributes code
	 */
	public String getCustomAttributesCode() {
		return customAttributesCode;
	}
	
	/**
	 * Sets the custom attributes code.
	 * 
	 * @param p_sCustomAttributesCode
	 *            the new custom attributes code
	 */
	public void setCustomAttributesCode(String p_sCustomAttributesCode) {
		this.customAttributesCode = p_sCustomAttributesCode;
	}
	
	
	
	
	
}
