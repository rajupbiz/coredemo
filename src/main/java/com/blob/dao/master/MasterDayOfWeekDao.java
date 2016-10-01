package com.blob.dao.master;

import java.util.List;

import com.blob.dao.common.GenericDao;
import com.blob.model.master.MasterDayOfWeek;

public interface MasterDayOfWeekDao extends GenericDao<MasterDayOfWeek, Long> {

	List<MasterDayOfWeek> findByStatusOrderBySequenceNumber(String status);
	
	MasterDayOfWeek findByDayOfWeek(String dayOfWeek);
}
