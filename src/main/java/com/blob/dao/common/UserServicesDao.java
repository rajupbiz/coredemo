package com.blob.dao.common;

import java.util.List;

import com.blob.model.common.User;
import com.blob.model.common.UserServices;

public interface UserServicesDao extends GenericDao<UserServices, Long> {

	List<UserServices> findByUserAndStatus(User user, String status);
}
