package com.ntqsolution.SiteProject.bussiness.vo;

import java.lang.reflect.Field;

import com.ntqsolution.SiteProject.constant.ResponseCode;

public abstract class RestEntityVO {

	private int code;
	
	private String message;
	
	public RestEntityVO() {

	}

	public RestEntityVO(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.setMessage(retreiveMessage(code));
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String retreiveMessage(int responseCode) {
		String message = "";
		Class<ResponseCode> responseClass = ResponseCode.class;
		Field[] fields = responseClass.getDeclaredFields();
		Integer code;
		for (Field field : fields) {
			try {
				code = (Integer)field.get(responseClass);
				if(code == responseCode) {
					message = field.getName();
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return message;
	}
	
}
