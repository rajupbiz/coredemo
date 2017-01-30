package com.blob.util;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.blob.dao.user.UserDao;
import com.blob.model.user.UserAddress;
import com.blob.model.user.UserContact;
import com.blob.model.user.UserEducation;
import com.blob.model.user.UserOccupation;

@Service
public class UiUtils {

	@Resource
	private GidGenerator gidGenerator;
	
	@Resource
	private UserDao UserDao;
	
	/*public String getAddressCityOrTown(List<UserAddress> addresses){
		String cityOrTown = null;
		if(CollectionUtils.isNotEmpty(addresses)){
			UserAddress ca = addresses.get(0);
			cityOrTown = ca.getCityOrTown();
		}
		return cityOrTown;
	}*/
	
	public String getPrimaryOccupation(List<UserOccupation> occupations){
		String occupation = null;
		if(CollectionUtils.isNotEmpty(occupations)){
			UserOccupation ca = occupations.get(0);
			occupation = ca.getOccupation().getOccupation();
		}
		return occupation;
	}
	
	public String getAddressTxt(List<UserAddress> addresses){
		StringBuffer addressStr = new StringBuffer();
		if(CollectionUtils.isNotEmpty(addresses)){
			UserAddress ca = addresses.get(0);
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
				addressStr.append(ca.getState()+", ");
			}
			if(ca.getCountry() != null){
				addressStr.append(ca.getCountry()+", ");
			}
		}
		return addressStr.toString();
	}
	
	public String getOccupationTxt(List<UserOccupation> occupations){
		if(CollectionUtils.isNotEmpty(occupations)){
			
		}
		return "";
	}
	
	public String getEducationTxt(List<UserEducation> educations){
		if(CollectionUtils.isNotEmpty(educations)){
			
		}
		return "";
	}
	
	public String getContactTxt(List<UserContact> contacts){
		String contact = "";
		if(CollectionUtils.isNotEmpty(contacts)){
			UserContact c = contacts.get(0);
			contact = c.getMobile();
		}
		return contact;
	}
	
	public String getLastSigndinTxt(){
		return "";
	}
}
