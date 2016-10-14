package com.blob.util;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.blob.dao.candidate.CandidateDao;
import com.blob.model.candidate.CandidateAddress;
import com.blob.model.candidate.CandidateContact;
import com.blob.model.candidate.CandidateEducation;
import com.blob.model.candidate.CandidateOccupation;

@Service
public class UiUtils {

	@Resource
	private GidGenerator gidGenerator;
	
	@Resource
	private CandidateDao candidateDao;
	
	public String getAddressCityOrTown(List<CandidateAddress> addresses){
		String cityOrTown = null;
		if(CollectionUtils.isNotEmpty(addresses)){
			CandidateAddress ca = addresses.get(0);
			cityOrTown = ca.getCityOrTown();
		}
		return cityOrTown;
	}
	
	public String getPrimaryOccupation(List<CandidateOccupation> occupations){
		String occupation = null;
		if(CollectionUtils.isNotEmpty(occupations)){
			CandidateOccupation ca = occupations.get(0);
			occupation = ca.getOccupation().getOccupation();
		}
		return occupation;
	}
	
	public String getAddressTxt(List<CandidateAddress> addresses){
		StringBuffer addressStr = new StringBuffer();
		if(CollectionUtils.isNotEmpty(addresses)){
			CandidateAddress ca = addresses.get(0);
			if(StringUtils.isNotBlank(ca.getAddressLine())){
				addressStr.append(ca.getAddressLine()+", ");
			}
			if(StringUtils.isNotBlank(ca.getCityOrTown())){
				addressStr.append(ca.getCityOrTown()+", ");
			}
			if(StringUtils.isNotBlank(ca.getTahsil())){
				addressStr.append(ca.getTahsil()+", ");
			}
			if(StringUtils.isNotBlank(ca.getDistrict())){
				addressStr.append(ca.getDistrict()+", ");
			}
			if(ca.getState() != null){
				addressStr.append(ca.getState().getState()+", ");
			}
			if(ca.getCountry() != null){
				addressStr.append(ca.getCountry().getCountry()+", ");
			}
		}
		return addressStr.toString();
	}
	
	public String getOccupationTxt(List<CandidateOccupation> occupations){
		if(CollectionUtils.isNotEmpty(occupations)){
			
		}
		return "";
	}
	
	public String getEducationTxt(List<CandidateEducation> educations){
		if(CollectionUtils.isNotEmpty(educations)){
			
		}
		return "";
	}
	
	public String getContactTxt(List<CandidateContact> contacts){
		String contact = "";
		if(CollectionUtils.isNotEmpty(contacts)){
			CandidateContact c = contacts.get(0);
			contact = c.getMobile();
		}
		return contact;
	}
	
	public String getLastSigndinTxt(){
		return "";
	}
}
