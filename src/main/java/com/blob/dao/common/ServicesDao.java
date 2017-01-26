package com.blob.dao.common;

import com.blob.model.common.Services;

public interface ServicesDao extends GenericDao<Services, Long> {
	
	Services findByServiceNameAndStatus(String serviceName, String status);
}
