package com.wcoin.common.domain;

import java.util.HashMap;
import java.util.Map;

public class ResponseMessage {

	private  Boolean  isSuccess=true;
	
	
	private  Object data;
	
	private  String message;
	private Map<String,Object> dataMap;

	
	
	
	public Map<String,Object> putDataMap(String key,Object value){
		if(dataMap==null){
			dataMap=new HashMap<String,Object>();
		}
		dataMap.put(key, value);
		return dataMap;
		
	}
	
	 

	public ResponseMessage(Object data, String message) {
		super();
		this.data = data;
		this.message = message;
	}
	public ResponseMessage(Object data) {
		super();
		this.data = data;
	}
	
	public ResponseMessage() {
		super();
	}
	
	
	public ResponseMessage(String data, String message,Boolean  isSuccess) {
		super();
		this.data = data;
		this.message = message;
		this.isSuccess=isSuccess;
	}




	public Boolean getIsSuccess() {
		return isSuccess;
	}


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}


	public Object getData() {
		return data;
	}


	public void setData(Object data) {
		this.data = data;
	}


	public Map<String, Object> getDataMap() {
		return dataMap;
	}


	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
			
	
	
}
