package com.blob.model.error;

public class FileUploadError {

	private String error;
	private String[] errorkeys;

	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String[] getErrorkeys() {
		return errorkeys;
	}
	public void setErrorkeys(String[] errorkeys) {
		this.errorkeys = errorkeys;
	}
}
