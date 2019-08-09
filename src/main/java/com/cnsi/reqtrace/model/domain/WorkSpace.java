/*
 * 
 */
package com.cnsi.reqtrace.model.domain;

import java.util.Date;
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
import javax.persistence.SequenceGenerator;


// TODO: Auto-generated Javadoc
/**
 * The Class WorkSpace.
 */
/**
 * @author govindasamim
 * 
 * @version 3.0
 *
 */
@Entity(name = "RM_WORKSPACE")
public class WorkSpace {

	
	/** The workspace sid. */
	@Id
    @Column(name = "WS_SID", nullable = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RM_WORKSPACE_SEQ")
    @SequenceGenerator(name="RM_WORKSPACE_SEQ", sequenceName="RM_WORKSPACE_SEQ", allocationSize=100)
	private Long workspaceSid;
	
	/** The workspace name. */
	@Column (name = "WS_NAME")
    private String workspaceName;
	
    /** The workspace description. */
    @Column (name = "WS_DESC")
    private String workspaceDescription;
    
    /** The created date. */
    @Column (name = "CREATED_DATE")
    private Date createdDate;

    /** The modified date. */
    @Column (name = "MODIFIED_DATE")
    private Date modifiedDate;
    
    /** The record status. */
    @Column (name = "RECORD_STATUS")
    private String recordStatus; 
    
    /** The custom attributes. */
    @OneToMany(mappedBy="workSpace")
    private List<WorkspaceCustomAttribute> customAttributes;
    
	/** The created by. */
    @JoinColumn(name="CREATED_BY")
    private String createdBy;

	/** The modified by. */
    @JoinColumn(name="MODIFIED_BY")
    private String modifiedBy;
 
	/**
	 * Gets the custom attributes.
	 * 
	 * @return the custom attributes
	 */
	public List<WorkspaceCustomAttribute> getCustomAttributes() {
		return customAttributes;
	}

	/**
	 * Sets the custom attributes.
	 * 
	 * @param p_lstCustomAttributes
	 *            the new custom attributes
	 */
	public void setCustomAttributes(List<WorkspaceCustomAttribute> p_lstCustomAttributes) {
		this.customAttributes = p_lstCustomAttributes;
	}

	/**
	 * Gets the workspace sid.
	 * 
	 * @return the workspace sid
	 */
	public Long getWorkspaceSid() {
		return workspaceSid;
	}

	/**
	 * Sets the workspace sid.
	 * 
	 * @param p_lWorkspaceSid
	 *            the new workspace sid
	 */
	public void setWorkspaceSid(Long p_lWorkspaceSid) {
		this.workspaceSid = p_lWorkspaceSid;
	}

	/**
	 * Gets the workspace name.
	 * 
	 * @return the workspace name
	 */
	public String getWorkspaceName() {
		return workspaceName;
	}

	/**
	 * Sets the workspace name.
	 * 
	 * @param p_sWorkspaceName
	 *            the new workspace name
	 */
	public void setWorkspaceName(String p_sWorkspaceName) {
		this.workspaceName = p_sWorkspaceName;
	}

	/**
	 * Gets the workspace description.
	 * 
	 * @return the workspace description
	 */
	public String getWorkspaceDescription() {
		return workspaceDescription;
	}

	/**
	 * Sets the workspace description.
	 * 
	 * @param p_sWorkspaceDescription
	 *            the new workspace description
	 */
	public void setWorkspaceDescription(String p_sWorkspaceDescription) {
		this.workspaceDescription = p_sWorkspaceDescription;
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
	 * Sets the requirement descripiton.
	 * 
	 * @param p_sWorkspaceDescription2
	 *            the new requirement descripiton
	 */
	public void setRequirementDescripiton(String p_sWorkspaceDescription2) {
		this.workspaceDescription = p_sWorkspaceDescription2;
		
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
	
	
}

