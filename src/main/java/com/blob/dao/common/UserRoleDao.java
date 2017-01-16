package com.blob.dao.common;

import java.util.List;

import com.blob.model.common.User;
import com.blob.model.common.UserRole;

public interface UserRoleDao extends GenericDao<UserRole, Long> {

	List<UserRole> findByUserAndStatus(User user, String status);
}
