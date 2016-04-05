package com.blob.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="candidate")
public class Candidate {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToMany(mappedBy="shortlistedCandidate")
	private List<CandidateShortlistedProfile> shortlistedCandidates;
	
	@OneToOne(mappedBy="candidate")
	private CandidatePersonalDetail candidatePersonalDetail;
	
	@OneToOne(mappedBy="candidate")
	private CandidateFamily candidateFamily;
	
	@OneToOne(mappedBy="candidate")
	private CandidateAstroDetail candidateAstroDetail;
	
	@OneToOne(mappedBy="candidate")
	private CandidateExpectation candidateExpectation;
	
	@OneToMany(mappedBy="candidate")
	private List<CandidateEducation> candidateEducation;
	
	@OneToMany(mappedBy="candidate")
	private List<CandidateAddress> candidateAddress;

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

	public List<CandidateEducation> getCandidateEducation() {
		return candidateEducation;
	}

	public void setCandidateEducation(List<CandidateEducation> candidateEducation) {
		this.candidateEducation = candidateEducation;
	}

	public List<CandidateAddress> getCandidateAddress() {
		return candidateAddress;
	}

	public void setCandidateAddress(List<CandidateAddress> candidateAddress) {
		this.candidateAddress = candidateAddress;
	}
}
