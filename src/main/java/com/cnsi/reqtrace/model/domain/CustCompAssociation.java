/*
 * 
 */
package com.cnsi.reqtrace.model.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

// TODO: Auto-generated Javadoc
/**
 * The Class CustCompAssociation.
 */
/**
 * @author govindasamim
 * 
 * @version 3.0
 *
 */
@Entity(name = "RM_COMP_X_WS_CA")
public class CustCompAssociation {

	/** The attribure id. */
	@Id
    @Column(name = "COMP_CA_SID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="RM_COMP_X_WS_CA_SEQ")
	@SequenceGenerator(name="RM_COMP_X_WS_CA_SEQ", sequenceName="RM_COMP_X_WS_CA_SEQ", allocationSize=100)
	public Long attribureId;
	
	
	/** The work space custom attribute id. */
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="WS_CA_SID")
	public WorkspaceCustomAttribute workSpaceCustomAttributeId;
	

	/** The component id. */
	@Column (name = "COMP_SID", nullable = false)
	public Long componentId;
	
	/** The display order. */
	@Column (name = "DISPLAY_ORDER")
	public Long displayOrder;
	
	/**
	 * Gets the attribure id.
	 * 
	 * @return the attribure id
	 */
	public Long getAttribureId() {
		return attribureId;
	}

	/**
	 * Sets the attribure id.
	 * 
	 * @param p_lAttribureId
	 *            the new attribure id
	 */
	public void setAttribureId(Long p_lAttribureId) {
		this.attribureId = p_lAttribureId;
	}

	/**
	 * Gets the work space custom attribute id.
	 * 
	 * @return the work space custom attribute id
	 */
	public WorkspaceCustomAttribute getWorkSpaceCustomAttributeId() {
		return workSpaceCustomAttributeId;
	}

	/**
	 * Sets the work space custom attribute id.
	 * 
	 * @param p_objWorkSpaceCustomAttributeId
	 *            the new work space custom attribute id
	 */
	public void setWorkSpaceCustomAttributeId(
			WorkspaceCustomAttribute p_objWorkSpaceCustomAttributeId) {
		this.workSpaceCustomAttributeId = p_objWorkSpaceCustomAttributeId;
	}

	/**
	 * Gets the component id.
	 * 
	 * @return the component id
	 */
	public Long getComponentId() {
		return componentId;
	}

	/**
	 * Sets the component id.
	 * 
	 * @param p_lComponentId
	 *            the new component id
	 */
	public void setComponentId(Long p_lComponentId) {
		this.componentId = p_lComponentId;
	}

	/**
	 * Gets the display order.
	 * 
	 * @return the display order
	 */
	public Long getDisplayOrder() {
		return displayOrder;
	}

	/**
	 * Sets the display order.
	 * 
	 * @param p_lDisplayOrder
	 *            the new display order
	 */
	public void setDisplayOrder(Long p_lDisplayOrder) {
		this.displayOrder = p_lDisplayOrder;
	}

	/**
	 * Gets the created by.
	 * 
	 * @return the created by
	 */
	public BigDecimal getCreatedBy() {
		return createdBy;
	}

	/**
	 * Sets the created by.
	 * 
	 * @param p_objCreatedBy
	 *            the new created by
	 */
	public void setCreatedBy(BigDecimal p_objCreatedBy) {
		this.createdBy = p_objCreatedBy;
	}

	/**
	 * Gets the mandatory.
	 * 
	 * @return the mandatory
	 */
	public String getMandatory() {
		return mandatory;
	}

	/**
	 * Sets the mandatory.
	 * 
	 * @param p_sMandatory
	 *            the new mandatory
	 */
	public void setMandatory(String p_sMandatory) {
		this.mandatory = p_sMandatory;
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

	/** The created by. */
	@Column (name = "CREATED_BY")
	public BigDecimal createdBy;

	/** The mandatory. */
	@Column (name = "MANDATORY")
	public String mandatory;
	
	
	/** The created date. */
	@Column (name = "CREATED_DATE")
	private Date createdDate;
	     
	
	 
	
}
