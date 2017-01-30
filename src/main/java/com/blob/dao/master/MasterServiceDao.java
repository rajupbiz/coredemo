package com.blob.dao.master;

import com.blob.dao.common.GenericDao;
import com.blob.model.master.MasterService;

public interface MasterServiceDao extends GenericDao<MasterService, Long> {
	
	MasterService findByServiceNameAndStatus(String serviceName, String status);
}
