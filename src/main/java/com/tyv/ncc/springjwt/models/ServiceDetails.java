package com.tyv.ncc.springjwt.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Service_Detail")
@Getter
@Setter
@NoArgsConstructor
public class ServiceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String serviceProvider;
	private Boolean isPaid ;
	private String location ;
	private String facilities ;
	private String contactNumber ;
	private String ContactPersonName ;
	private String charges ;
	private String organisationType ;
	private String timings ;
	private String comments ;

		
		@ManyToOne(fetch = FetchType.LAZY)
		private Services service ;


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getServiceProvider() {
			return serviceProvider;
		}


		public void setServiceProvider(String serviceProvider) {
			this.serviceProvider = serviceProvider;
		}


		public Boolean getIsPaid() {
			return isPaid;
		}


		public void setIsPaid(Boolean isPaid) {
			this.isPaid = isPaid;
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


		public String getContactNumber() {
			return contactNumber;
		}


		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}


		public String getContactPersonName() {
			return ContactPersonName;
		}


		public void setContactPersonName(String contactPersonName) {
			ContactPersonName = contactPersonName;
		}


		public String getCharges() {
			return charges;
		}


		public void setCharges(String charges) {
			this.charges = charges;
		}


		public String getOrganisationType() {
			return organisationType;
		}


		public void setOrganisationType(String organisationType) {
			this.organisationType = organisationType;
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


		public Services getService() {
			return service;
		}


		public void setService(Services service) {
			this.service = service;
		}


		public ServiceDetails(Long id, String serviceProvider, Boolean isPaid, String location, String facilities,
				String contactNumber, String contactPersonName, String charges, String organisationType, String timings,
				String comments, Services service) {
			super();
			this.id = id;
			this.serviceProvider = serviceProvider;
			this.isPaid = isPaid;
			this.location = location;
			this.facilities = facilities;
			this.contactNumber = contactNumber;
			ContactPersonName = contactPersonName;
			this.charges = charges;
			this.organisationType = organisationType;
			this.timings = timings;
			this.comments = comments;
			this.service = service;
		}


		

	}