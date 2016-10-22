package com.blob.dao.common;

import java.util.List;

import com.blob.model.common.GPhoto;
import com.blob.model.common.User;

public interface GPhotoDao extends GenericDao<GPhoto, Long> {

	List<GPhoto> findByUserAndCategoryAndStatus(User user, String category, String status);
	
	GPhoto findByUserAndIsSagaiPrimary(User user, Boolean isSagaiPrimary);
	
	Long countByUserAndCategory(User user, String category);
}
