package com.cnsi.reqtrace.model.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExcelReqCertify {

	@Id
	private String Checklist_ID;
	
	private String Checklist_Standard;
	
	private String Checklist_Description;
	
	private String Criteria_Number;
	
	private String Criteria_Name;
	
	private String Criteria_Business_Objective;
	
	private String Criteria_Description;
	
	private String 	Criteria_Source;
	
	private String Business_Process;
	
	private String Business_Process_ID;
	
	private String Business_Area;

	public String getChecklist_ID() {
		return Checklist_ID;
	}

	public void setChecklist_ID(String checklist_ID) {
		Checklist_ID = checklist_ID;
	}

	public String getChecklist_Standard() {
		return Checklist_Standard;
	}

	public void setChecklist_Standard(String checklist_Standard) {
		Checklist_Standard = checklist_Standard;
	}

	public String getChecklist_Description() {
		return Checklist_Description;
	}

	public void setChecklist_Description(String checklist_Description) {
		Checklist_Description = checklist_Description;
	}

	public String getCriteria_Number() {
		return Criteria_Number;
	}

	public void setCriteria_Number(String criteria_Number) {
		Criteria_Number = criteria_Number;
	}

	public String getCriteria_Name() {
		return Criteria_Name;
	}

	public void setCriteria_Name(String criteria_Name) {
		Criteria_Name = criteria_Name;
	}

	public String getCriteria_Business_Objective() {
		return Criteria_Business_Objective;
	}

	public void setCriteria_Business_Objective(String criteria_Business_Objective) {
		Criteria_Business_Objective = criteria_Business_Objective;
	}

	public String getCriteria_Description() {
		return Criteria_Description;
	}

	public void setCriteria_Description(String criteria_Description) {
		Criteria_Description = criteria_Description;
	}

	public String getCriteria_Source() {
		return Criteria_Source;
	}

	public void setCriteria_Source(String criteria_Source) {
		Criteria_Source = criteria_Source;
	}

	public String getBusiness_Process() {
		return Business_Process;
	}

	public void setBusiness_Process(String business_Process) {
		Business_Process = business_Process;
	}

	public String getBusiness_Process_ID() {
		return Business_Process_ID;
	}

	public void setBusiness_Process_ID(String business_Process_ID) {
		Business_Process_ID = business_Process_ID;
	}

	public String getBusiness_Area() {
		return Business_Area;
	}

	public void setBusiness_Area(String business_Area) {
		Business_Area = business_Area;
	}
	
	
	









	
}
