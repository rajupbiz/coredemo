package com.blob.util;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.blob.dao.candidate.CandidateDao;
import com.blob.model.candidate.Candidate;

@Service
public class GUtils {

	@Resource
	private GidGenerator gidGenerator;
	
	@Resource
	private CandidateDao candidateDao;
	
	/**
	 * Generate unique 6 char gid
	 */
	public String generateGid(){
		
		StringBuffer resp = new StringBuffer();
		Boolean found = false;
		do {
			resp.append(gidGenerator.generateRandomCharString());
			resp.append(gidGenerator.generateRandomNumericString());
			Candidate c = candidateDao.findByGid(resp.toString());
			if(c != null && StringUtils.isNotBlank(c.getGid())){
				resp = new StringBuffer();
			}else{
				found = true;
			}
		} while (!found);
		return resp.toString();
	}
}

