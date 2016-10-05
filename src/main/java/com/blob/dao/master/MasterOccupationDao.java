package com.blob.dao.master;

import java.util.List;

import com.blob.dao.common.GenericDao;
import com.blob.model.master.MasterOccupation;

public interface MasterOccupationDao extends GenericDao<MasterOccupation, Long> {

	List<MasterOccupation> findByStatusOrderBySequenceNumber(String status);
}
