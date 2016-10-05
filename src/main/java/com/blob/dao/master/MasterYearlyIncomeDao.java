package com.blob.dao.master;

import java.util.List;

import com.blob.dao.common.GenericDao;
import com.blob.model.master.MasterYearlyIncome;

public interface MasterYearlyIncomeDao extends GenericDao<MasterYearlyIncome, Long> {

	List<MasterYearlyIncome> findByStatusOrderBySequenceNumber(String status);
}
