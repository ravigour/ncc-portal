package com.tyv.ncc.springjwt.payload.request;

import javax.validation.constraints.NotBlank;

public class ServiceRegisterRequest {

	long serviceId;
	private String serviceName;
	
	private String displayName;

	public long getServiceId() {
		return serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public ServiceRegisterRequest(long serviceId, String serviceName, String displayName) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.displayName = displayName;
	}

	
	
	
	
}
