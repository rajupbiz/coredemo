package com.blob.dao.candidate;

import com.blob.dao.common.GenericDao;
import com.blob.model.candidate.Candidate;

public interface CandidateDao extends GenericDao<Candidate, Long> {

	Candidate findByGid(String gid);
}
