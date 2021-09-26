package com.tyv.ncc.springjwt.payload.response;

public class ServiceResponse {

	long service_id;
	private String service_name;
	
	private String display_name;

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public String getDisplay_name() {
		return display_name;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	
	public long getService_id() {
		return service_id;
	}

	public void setService_id(long service_id) {
		this.service_id = service_id;
	}

	public ServiceResponse(long service_id ,String service_name, String display_name) {
		super();
		this.service_id= service_id;
		this.service_name = service_name;
		this.display_name = display_name;
	}
}
