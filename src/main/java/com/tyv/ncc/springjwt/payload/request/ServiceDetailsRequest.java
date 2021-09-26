package com.tyv.ncc.springjwt.payload.request;

import javax.validation.constraints.NotBlank;

public class ServiceDetailsRequest {

	private String service_name;
	
	private String service_Provider;
	private Boolean is_Paid ;
	private String location ;
	private String facilities ;
	private String contact_Number ;
	private String Contact_Person_Name ;
	private String charges ;
	private String organisation_Type ;
	private String timings ;
	private String comments ;
	
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getService_Provider() {
		return service_Provider;
	}
	public void setService_Provider(String service_Provider) {
		this.service_Provider = service_Provider;
	}
	public Boolean getIs_Paid() {
		return is_Paid;
	}
	public void setIs_Paid(Boolean is_Paid) {
		this.is_Paid = is_Paid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFacilities() {
		return facilities;
	}
	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	public String getContact_Number() {
		return contact_Number;
	}
	public void setContact_Number(String contact_Number) {
		this.contact_Number = contact_Number;
	}
	public String getContact_Person_Name() {
		return Contact_Person_Name;
	}
	public void setContact_Person_Name(String contact_Person_Name) {
		Contact_Person_Name = contact_Person_Name;
	}
	public String getCharges() {
		return charges;
	}
	public void setCharges(String charges) {
		this.charges = charges;
	}
	public String getOrganisation_Type() {
		return organisation_Type;
	}
	public void setOrganisation_Type(String organisation_Type) {
		this.organisation_Type = organisation_Type;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
	
}
