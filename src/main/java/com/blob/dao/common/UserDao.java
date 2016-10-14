package com.blob.dao.common;

import com.blob.model.common.User;

public interface UserDao extends GenericDao<User, Long> {

	public User findByUsername(String username);
}
