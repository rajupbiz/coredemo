package com.blob.dao.account;

import com.blob.dao.common.GenericDao;
import com.blob.model.account.Account;

public interface AccountDao extends GenericDao<Account, Long> {

	Account findByGid(String gid);
	
	Account findByUsername(String username);
}
