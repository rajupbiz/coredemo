package com.blob.dao.master;

import java.util.List;

import com.blob.dao.common.GenericDao;
import com.blob.model.master.MasterDegree;

public interface MasterDegreeDao extends GenericDao<MasterDegree, Long> {

	List<MasterDegree> findByStatusOrderBySequenceNumber(String status);
}
