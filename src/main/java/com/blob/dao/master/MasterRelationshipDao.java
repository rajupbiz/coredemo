package com.blob.dao.master;

import java.util.List;

import com.blob.dao.common.GenericDao;
import com.blob.model.master.MasterRelationship;

public interface MasterRelationshipDao extends GenericDao<MasterRelationship, Long> {

	List<MasterRelationship> findByStatusOrderBySequenceNumber(String status);
}
