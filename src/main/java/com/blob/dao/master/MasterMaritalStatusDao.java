package com.blob.dao.master;

import java.util.List;

import com.blob.dao.common.GenericDao;
import com.blob.model.master.MasterMaritalStatus;

public interface MasterMaritalStatusDao extends GenericDao<MasterMaritalStatus, Long> {

	List<MasterMaritalStatus> findByStatusOrderBySequenceNumber(String status);
}
