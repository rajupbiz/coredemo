package com.blob.util;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.blob.dao.account.AccountDao;
import com.blob.model.account.Account;

@Service
public class GUtils {

	@Resource
	private GidGenerator gidGenerator;
	
	@Resource
	private AccountDao accountDao;
	
	/**
	 * Generate unique 6 char gid
	 * TODO: to avoid random number generation use algorithm to have unique number generated sequentially like AZ9999, AZ9998, AZ9997 etc..
	 * 		-	Have list of 2 character strings like (AA, AB,AC etc)
	 * 		-	Get last userId and GID for last user Id	
	 * 		-	Pick last user's first 2 characters, lets say last userid is 799 and first 2 characters of GID are AK
	 * 		- 	Get last characters like lets day 0780
	 * 		-	if (0780 + 1) <= 9999 then new GID is AK0781
	 * 		-	else GID is AH (get next 2 characters from list of character strings from database table by order number and status as ACTIVE and make the status as IN PROGRESS)
	 * 
	 */
	public String generateGid(){
		
		StringBuffer resp = new StringBuffer();
		Boolean found = false;
		do {
			resp.append(gidGenerator.generateRandomCharString());
			resp.append(gidGenerator.generateRandomNumericString());
			Account c = accountDao.findByGid(resp.toString());
			if(c != null && StringUtils.isNotBlank(c.getGid())){
				resp = new StringBuffer();
			}else{
				found = true;
			}
		} while (!found);
		return resp.toString();
	}
}

