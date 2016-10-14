package com.blob.model.candidate;

import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.blob.model.common.User;
import com.blob.model.master.MasterYearlyIncome;

@Entity
@Table(name="candidate")
public class Candidate {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="gid",nullable=false,length=6,unique=true)
	private String gid;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy="shortlistedCandidate")
	private List<CandidateShortlistedProfile> shortlistedCandidates;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy="candidate")
	private CandidatePersonalDetail candidatePersonalDetail;
	
	@OneToOne(mappedBy="candidate")
	private CandidateFamily candidateFamily;
	
	@OneToOne(mappedBy="candidate")
	private CandidateAstroDetail candidateAstroDetail;
	
	@OneToOne(mappedBy="candidate")
	private CandidateExpectation candidateExpectation;
	
	@OneToMany(mappedBy="candidate")
	private List<CandidateEducation> candidateEducations;
	
	@OneToMany(mappedBy="candidate")
	private List<CandidateAddress> candidateAddresses;
	
	@OneToMany(mappedBy="candidate")
	private List<CandidateContact> candidateContacts;
	
	@OneToMany(mappedBy="candidate")
	private List<CandidateOccupation> candidateOccupations;
	
	@OneToOne
	@JoinColumn(name="yearly_income_id")
	private MasterYearlyIncome yearlyIncome;

	@Column(name="status")
	private String status;
	
	@Column(name="create_on")
	private Date createOn;
	
	@Column(name="update_user")
	private Long updateUser;
	
	@Column(name="update_on")
	private Date updateOn;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<CandidateShortlistedProfile> getShortlistedCandidates() {
		return shortlistedCandidates;
	}

	public void setShortlistedCandidates(
			List<CandidateShortlistedProfile> shortlistedCandidates) {
		this.shortlistedCandidates = shortlistedCandidates;
	}

	public CandidatePersonalDetail getCandidatePersonalDetail() {
		return candidatePersonalDetail;
	}

	public void setCandidatePersonalDetail(
			CandidatePersonalDetail candidatePersonalDetail) {
		this.candidatePersonalDetail = candidatePersonalDetail;
	}

	public CandidateFamily getCandidateFamily() {
		return candidateFamily;
	}

	public void setCandidateFamily(CandidateFamily candidateFamily) {
		this.candidateFamily = candidateFamily;
	}

	public CandidateAstroDetail getCandidateAstroDetail() {
		return candidateAstroDetail;
	}

	public void setCandidateAstroDetail(CandidateAstroDetail candidateAstroDetail) {
		this.candidateAstroDetail = candidateAstroDetail;
	}

	public CandidateExpectation getCandidateExpectation() {
		return candidateExpectation;
	}

	public void setCandidateExpectation(CandidateExpectation candidateExpectation) {
		this.candidateExpectation = candidateExpectation;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getCreateOn() {
		return createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<CandidateEducation> getCandidateEducations() {
		return candidateEducations;
	}

	public void setCandidateEducations(List<CandidateEducation> candidateEducations) {
		this.candidateEducations = candidateEducations;
	}

	public List<CandidateAddress> getCandidateAddresses() {
		return candidateAddresses;
	}

	public void setCandidateAddresses(List<CandidateAddress> candidateAddresses) {
		this.candidateAddresses = candidateAddresses;
	}

	public List<CandidateContact> getCandidateContacts() {
		return candidateContacts;
	}

	public void setCandidateContacts(List<CandidateContact> candidateContacts) {
		this.candidateContacts = candidateContacts;
	}

	public List<CandidateOccupation> getCandidateOccupations() {
		return candidateOccupations;
	}

	public void setCandidateOccupations(List<CandidateOccupation> candidateOccupations) {
		this.candidateOccupations = candidateOccupations;
	}

	public MasterYearlyIncome getYearlyIncome() {
		return yearlyIncome;
	}

	public void setYearlyIncome(MasterYearlyIncome yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}
}
