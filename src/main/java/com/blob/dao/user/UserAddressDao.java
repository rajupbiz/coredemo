package com.blob.dao.user;

import com.blob.dao.common.GenericDao;
import com.blob.model.user.User;
import com.blob.model.user.UserAddress;

public interface UserAddressDao extends GenericDao<UserAddress, Long> {

	UserAddress findFirstByUserAndAddressTypeAndStatusOrderByUpdateOnDesc(User c, String addressType, String Status);
}
