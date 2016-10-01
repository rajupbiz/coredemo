package com.blob.dao.master;

import java.util.List;

import com.blob.dao.common.GenericDao;
import com.blob.model.master.MasterCountry;

public interface MasterCountryDao extends GenericDao<MasterCountry, Long> {

	List<MasterCountry> findByStatusOrderBySequenceNumber(String status);
}
