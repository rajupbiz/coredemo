package com.blob.dao.master;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.blob.dao.common.GenericDao;
import com.blob.model.master.MasterDegree;

public interface MasterDegreeDao extends GenericDao<MasterDegree, Long> {

	List<MasterDegree> findByStatusOrderBySequenceNumber(String status);
	
	@Query("select d from MasterDegree d where d.status = 'Active'")
	List<MasterDegree> searchDegrees();
}
