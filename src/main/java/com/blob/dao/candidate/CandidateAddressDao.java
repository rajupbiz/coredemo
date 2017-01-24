package com.blob.dao.candidate;

import com.blob.dao.common.GenericDao;
import com.blob.model.candidate.Candidate;
import com.blob.model.candidate.CandidateAddress;

public interface CandidateAddressDao extends GenericDao<CandidateAddress, Long> {

	CandidateAddress findFirstByCandidateAndAddressTypeAndStatusOrderByUpdateOnDesc(Candidate c, String addressType, String Status);
}
