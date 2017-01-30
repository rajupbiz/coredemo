package com.blob.dao.user;

import java.util.List;

import com.blob.dao.common.GenericDao;
import com.blob.model.user.User;
import com.blob.model.user.UserPhoto;

public interface UserPhotoDao extends GenericDao<UserPhoto, Long> {

	List<UserPhoto> findByUserAndCategoryAndStatus(User user, String category, String status);
	
	UserPhoto findByUserAndIsSagaiPrimary(User user, Boolean isSagaiPrimary);
	
	Long countByUserAndCategory(User user, String category);
	
	UserPhoto findByFileNameLikeAndStatus(String status, String fileName);
}
