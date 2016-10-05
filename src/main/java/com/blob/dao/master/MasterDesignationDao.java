package com.blob.dao.master;

import java.util.List;

import com.blob.dao.common.GenericDao;
import com.blob.model.master.MasterDesignation;

public interface MasterDesignationDao extends GenericDao<MasterDesignation, Long> {

	List<MasterDesignation> findByStatusOrderBySequenceNumber(String status);
}
