package com.blob.dao.account;

import java.util.List;

import com.blob.dao.common.GenericDao;
import com.blob.model.account.Account;
import com.blob.model.account.AccountRole;

public interface AccountRoleDao extends GenericDao<AccountRole, Long> {

	List<AccountRole> findByAccountAndStatus(Account account, String status);
}
