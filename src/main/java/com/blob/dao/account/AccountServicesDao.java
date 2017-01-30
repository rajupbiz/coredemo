package com.blob.dao.account;

import java.util.List;

import com.blob.dao.common.GenericDao;
import com.blob.model.account.Account;
import com.blob.model.account.AccountServices;

public interface AccountServicesDao extends GenericDao<AccountServices, Long> {

	List<AccountServices> findByAccountAndStatus(Account account, String status);
}
