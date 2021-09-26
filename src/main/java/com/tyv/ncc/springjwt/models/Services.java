package com.tyv.ncc.springjwt.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Services")
@Getter
@Setter
@NoArgsConstructor
public class Services {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serviceId;

	
	@NotBlank
	private String serviceName;
	@NotBlank
	private String displayName;
	
	public Services()
	{
		
	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
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

	public Services(Long serviceId, @NotBlank String serviceName, @NotBlank String displayName) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.displayName = displayName;
	}

	
	
}