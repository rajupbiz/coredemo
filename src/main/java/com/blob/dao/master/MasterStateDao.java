package com.blob.dao.master;

import java.util.List;

import com.blob.dao.common.GenericDao;
import com.blob.model.master.MasterState;

public interface MasterStateDao extends GenericDao<MasterState, Long> {

	List<MasterState> findByStatusOrderBySequenceNumber(String status);
}
