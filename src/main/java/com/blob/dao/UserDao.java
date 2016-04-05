package com.blob.dao;

import com.blob.dao.common.GenericDao;
import com.blob.model.User;

public interface UserDao extends GenericDao<User, Long> {

	public User findByUsername(String username);
}
