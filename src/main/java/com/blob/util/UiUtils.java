package com.blob.util;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.blob.dao.CandidateDao;
import com.blob.model.Candidate;
import com.blob.model.CandidateAddress;
import com.blob.model.CandidateContact;
import com.blob.model.CandidateEducation;
import com.blob.model.CandidateMessage;
import com.blob.model.CandidateOccupation;
import com.blob.model.CandidateShortlistedProfile;
import com.blob.model.ui.Message;
import com.blob.model.ui.ShortlistedProfile;

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
	
	public List<ShortlistedProfile> getShortlistedProfiles(List<CandidateShortlistedProfile> candidateProfiles){
		List<ShortlistedProfile> shortlistedProfiles = null;
		if(CollectionUtils.isNotEmpty(candidateProfiles)){
			shortlistedProfiles = new ArrayList<>();
			ShortlistedProfile p = null;
			for (CandidateShortlistedProfile profile : candidateProfiles) {
				if(profile != null){
					Candidate candidate = profile.getShortlistedCandidate();
					p = new ShortlistedProfile();
					p.setFullName(candidate.getCandidatePersonalDetail().getFirstName() + " " + candidate.getCandidatePersonalDetail().getLastName());
					p.setDateOfBirth(DateUtils.toDDMMYYYY(DateUtils.toLocalDate(candidate.getCandidateAstroDetail().getBirthDate())));
					p.setAddress(getAddressCityOrTown(candidate.getCandidateAddresses()));
					p.setOccupation(getPrimaryOccupation(candidate.getCandidateOccupations()));
					shortlistedProfiles.add(p);
				}
			}
		}
		return shortlistedProfiles;
	}
	
	public List<Message> getMessages(List<CandidateMessage> candidateMessages){
		List<Message> messages = null;
		if(CollectionUtils.isNotEmpty(candidateMessages)){
			messages = new ArrayList<>();
			Message m = null;
			for (CandidateMessage message : candidateMessages) {
				if(message != null){
					Candidate fromCandidate = message.getFrom();
					m = new Message();
					m.setMessageId(message.getId());
					m.setFrom(fromCandidate.getCandidatePersonalDetail().getFirstName() + " " + fromCandidate.getCandidatePersonalDetail().getLastName());
					m.setSubject(message.getSubject());
					m.setBody(message.getBody());
					m.setDateReceived(DateUtils.toDDMMYYYY(DateUtils.toLocalDate(message.getCreateOn())));
					messages.add(m);
				}
			}
		}
		return messages;
	}
	
	public String getLastSigndinTxt(){
		return "";
	}
	
}
