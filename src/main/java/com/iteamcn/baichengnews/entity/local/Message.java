package com.iteamcn.baichengnews.entity.local;

public class Message {
	public static final int SUCCESS=100;
	public static final String SUCCESS_INFO="成功";
	public static final int ERROR=200;
	public static final String ERROR_INFO="错误";
	public static final int ERROR_ARGUMENTS=201;
	public static final String ERROR_ARGUMENTS_INFO="参数错误";
	public static final int ERROR_AUTHORIZATION=202;
	public static final String ERROR_AUTHORIZATION_INFO="没有授权";
	
	private int code;
	private String info;
	private Object object;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public Message(int code, String info, Object object) {
		super();
		this.code = code;
		this.info = info;
		this.object = object;
	}
	public Message() {
		super();
	}
	
}
