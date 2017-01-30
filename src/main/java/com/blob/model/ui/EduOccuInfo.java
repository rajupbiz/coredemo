package com.blob.model.ui;

import java.util.List;

import com.blob.model.master.MasterDegree;
import com.blob.model.master.MasterDegreeSpecialization;
import com.blob.model.master.MasterDesignation;
import com.blob.model.master.MasterOccupation;
import com.blob.model.master.MasterYearlyIncome;
import com.blob.model.user.UserEducation;
import com.blob.model.user.UserOccupation;

public class EduOccuInfo {

	private List<UserEducation> educations;
	private List<UserOccupation> occupations;
	private String yearlyIncomeStr;
	private Long yearlyIncomeId;
	private List<MasterDegree> degreeOptions;
	private List<MasterDegreeSpecialization> specializationOptions;
	private List<MasterDesignation> designationOptions;
	private List<MasterOccupation> occupationOptions;
	private List<MasterYearlyIncome> yearlyIncomeOptions;

	public List<UserEducation> getEducations() {
		return educations;
	}
	public void setEducations(List<UserEducation> educations) {
		this.educations = educations;
	}
	public List<UserOccupation> getOccupations() {
		return occupations;
	}
	public void setOccupations(List<UserOccupation> occupations) {
		this.occupations = occupations;
	}
	public List<MasterDegree> getDegreeOptions() {
		return degreeOptions;
	}
	public void setDegreeOptions(List<MasterDegree> degreeOptions) {
		this.degreeOptions = degreeOptions;
	}
	public List<MasterDesignation> getDesignationOptions() {
		return designationOptions;
	}
	public void setDesignationOptions(List<MasterDesignation> designationOptions) {
		this.designationOptions = designationOptions;
	}
	public List<MasterOccupation> getOccupationOptions() {
		return occupationOptions;
	}
	public void setOccupationOptions(List<MasterOccupation> occupationOptions) {
		this.occupationOptions = occupationOptions;
	}
	public List<MasterYearlyIncome> getYearlyIncomeOptions() {
		return yearlyIncomeOptions;
	}
	public void setYearlyIncomeOptions(List<MasterYearlyIncome> yearlyIncomeOptions) {
		this.yearlyIncomeOptions = yearlyIncomeOptions;
	}
	public List<MasterDegreeSpecialization> getSpecializationOptions() {
		return specializationOptions;
	}
	public void setSpecializationOptions(List<MasterDegreeSpecialization> specializationOptions) {
		this.specializationOptions = specializationOptions;
	}
	public String getYearlyIncomeStr() {
		return yearlyIncomeStr;
	}
	public void setYearlyIncomeStr(String yearlyIncomeStr) {
		this.yearlyIncomeStr = yearlyIncomeStr;
	}
	public Long getYearlyIncomeId() {
		return yearlyIncomeId;
	}
	public void setYearlyIncomeId(Long yearlyIncomeId) {
		this.yearlyIncomeId = yearlyIncomeId;
	}
}
