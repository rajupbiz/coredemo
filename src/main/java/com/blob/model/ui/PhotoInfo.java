package com.blob.model.ui;

import java.util.List;

public class PhotoInfo {

	private List<Photo> photos;
	
	private Boolean isUploadAllowed;
	
	private Photo primaryPhoto;
	
	private String primaryPicPath;
	
	/*private String photoList;*/

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public Boolean getIsUploadAllowed() {
		return isUploadAllowed;
	}

	public void setIsUploadAllowed(Boolean isUploadAllowed) {
		this.isUploadAllowed = isUploadAllowed;
	}

	public Photo getPrimaryPhoto() {
		return primaryPhoto;
	}

	public void setPrimaryPhoto(Photo primaryPhoto) {
		this.primaryPhoto = primaryPhoto;
	}

	public String getPrimaryPicPath() {
		return primaryPicPath;
	}

	public void setPrimaryPicPath(String primaryPicPath) {
		this.primaryPicPath = primaryPicPath;
	}

	/*public String getPhotoList() {
		return photoList;
	}

	public void setPhotoList(String photoList) {
		this.photoList = photoList;
	}*/
}
