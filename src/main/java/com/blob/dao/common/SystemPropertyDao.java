package com.blob.dao.common;

import com.blob.model.common.SystemProperty;

public interface SystemPropertyDao extends GenericDao<SystemProperty, Long> {

	SystemProperty findByListNameAndListKeyAndStatus(String listName, String listKey, String status);
}
