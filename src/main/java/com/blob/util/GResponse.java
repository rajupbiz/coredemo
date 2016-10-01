package com.blob.util;

public class GResponse {

	public boolean success;
	public GError error;
	public Object data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public GError getError() {
		return error;
	}

	public void setError(GError error) {
		this.error = error;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
