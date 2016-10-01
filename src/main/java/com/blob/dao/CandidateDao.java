package com.blob.dao;

import com.blob.dao.common.GenericDao;
import com.blob.model.Candidate;

public interface CandidateDao extends GenericDao<Candidate, Long> {

	Candidate findByGid(String gid);
}
