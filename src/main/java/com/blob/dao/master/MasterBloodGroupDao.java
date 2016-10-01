package com.blob.dao.master;

import java.util.List;

import com.blob.dao.common.GenericDao;
import com.blob.model.master.MasterBloodGroup;

public interface MasterBloodGroupDao extends GenericDao<MasterBloodGroup, Long> {

	List<MasterBloodGroup> findByStatusOrderBySequenceNumber(String status);
}
