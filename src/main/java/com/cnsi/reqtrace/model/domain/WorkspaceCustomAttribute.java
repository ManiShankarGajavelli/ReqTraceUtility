package com.cnsi.reqtrace.model.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;

/**
 * The Class WorkspaceCustomAttribute.
 */
/**
 * @author govindasamim
 * 
 * @version 3.0
 *
 */
@Entity(name = "RM_WS_X_CA")
public class WorkspaceCustomAttribute {

	/** The workspace custom attribute sid. */
	@Id
	@Column(name = "WS_CA_SID", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RM_CA_SEQ")
	@SequenceGenerator(name = "RM_CA_SEQ", sequenceName = "RM_WS_X_CA_SEQ", allocationSize = 100)
	private Long workspaceCustomAttributeSid;

	/** The work space. */
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = WorkSpace.class)
	@PrimaryKeyJoinColumn(name = "WS_SID")
	private WorkSpace workSpace;

	/** The custom attribute. */
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = CustomAttribite.class)
	@PrimaryKeyJoinColumn(name = "ATT_CID")
	private CustomAttribite customAttribute;

	/** The created by. */
	@Column(name = "CREATED_BY")
	private String createdBy;

	/** The created date. */
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	/** The display name. */
	@Column(name = "ATT_DISPLAY_NAME")
	private String displayName;

	/** The component custom attributes. */
	@OneToMany
	@JoinColumn(name = "WS_CA_SID")
	@OrderBy("displayOrder")
	private List<CustCompAssociation> componentCustomAttributes;

	/**
	 * Gets the workspace custom attribute sid.
	 * 
	 * @return the workspace custom attribute sid
	 */
	public Long getWorkspaceCustomAttributeSid() {
		return workspaceCustomAttributeSid;
	}

	/**
	 * Sets the workspace custom attribute sid.
	 * 
	 * @param p_lWorkspaceCustomAttributeSid
	 *            the new workspace custom attribute sid
	 */
	public void setWorkspaceCustomAttributeSid(Long p_lWorkspaceCustomAttributeSid) {
		this.workspaceCustomAttributeSid = p_lWorkspaceCustomAttributeSid;
	}

	/**
	 * Gets the work space.
	 * 
	 * @return the work space
	 */
	public WorkSpace getWorkSpace() {
		return workSpace;
	}

	/**
	 * Sets the work space.
	 * 
	 * @param p_objWorkSpace
	 *            the new work space
	 */
	public void setWorkSpace(WorkSpace p_objWorkSpace) {
		this.workSpace = p_objWorkSpace;
	}

	/**
	 * Gets the custom attribute.
	 * 
	 * @return the custom attribute
	 */
	public CustomAttribite getCustomAttribute() {
		return customAttribute;
	}

	/**
	 * Sets the custom attribute.
	 * 
	 * @param p_objCustomAttribute
	 *            the new custom attribute
	 */
	public void setCustomAttribute(CustomAttribite p_objCustomAttribute) {
		this.customAttribute = p_objCustomAttribute;
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
	 * Gets the display name.
	 * 
	 * @return the display name
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the display name.
	 * 
	 * @param p_sDisplayName
	 *            the new display name
	 */
	public void setDisplayName(String p_sDisplayName) {
		this.displayName = p_sDisplayName;
	}

	/**
	 * Gets the component custom attributes.
	 * 
	 * @return the component custom attributes
	 */
	public List<CustCompAssociation> getComponentCustomAttributes() {
		return componentCustomAttributes;
	}

	/**
	 * Sets the component custom attributes.
	 * 
	 * @param p_lstComponentCustomAttributes
	 *            the new component custom attributes
	 */
	public void setComponentCustomAttributes(
			List<CustCompAssociation> p_lstComponentCustomAttributes) {
		this.componentCustomAttributes = p_lstComponentCustomAttributes;
	}

}
