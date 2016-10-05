package com.blob.dao.master;

import java.util.List;

import com.blob.dao.common.GenericDao;
import com.blob.model.master.MasterDegreeSpecialization;

public interface MasterDegreeSpecializationDao extends GenericDao<MasterDegreeSpecialization, Long> {

	List<MasterDegreeSpecialization> findByStatusOrderBySequenceNumber(String status);
}
