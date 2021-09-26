package com.tyv.ncc.springjwt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyv.ncc.springjwt.exceptions.NccPortalException;
import com.tyv.ncc.springjwt.models.ServiceDetails;
import com.tyv.ncc.springjwt.models.Services;
import com.tyv.ncc.springjwt.payload.request.ServiceRegisterRequest;
import com.tyv.ncc.springjwt.payload.response.ServiceResponse;
import com.tyv.ncc.springjwt.repository.ServicesRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Service
public class ServicesService {




    @Autowired
    ServicesRepository servicesRepository;

    public void createNewService(ServiceRegisterRequest serviceRegisterRequest) throws NccPortalException {
      
    	Services service = new Services();
        if(servicesRepository.existsByServiceName(serviceRegisterRequest.getServiceName()))
        {
        	throw new NccPortalException("Service Already Registered");
        }	
        service.setServiceName(serviceRegisterRequest.getServiceName());
        service.setDisplayName(serviceRegisterRequest.getDisplayName());
        servicesRepository.save(service);
       
    }
    
    public void updateService(ServiceRegisterRequest serviceRegisterRequest) throws NccPortalException {
        
    	Optional<Services> oservice = null;
        if(!servicesRepository.existsByServiceId(serviceRegisterRequest.getServiceId()))
        {
        	throw new NccPortalException("Service not Available");
        }	
       
        oservice=  servicesRepository.findByServiceId(serviceRegisterRequest.getServiceId());
        if(oservice.isPresent()){
        	Services service = oservice.get();
        	service.setDisplayName(serviceRegisterRequest.getDisplayName());
        	service.setServiceName(serviceRegisterRequest.getServiceName());
        	servicesRepository.save(service);
            }
        
    }
       
 public ServiceResponse getService(long id) throws NccPortalException {
        
    	Optional<Services> oservice = null;
    	ServiceResponse response ;
        oservice=  servicesRepository.findByServiceId(id);
        if(oservice.isPresent()){
        	Services service = oservice.get();
        	response = new ServiceResponse(service.getServiceId(), service.getServiceName(), service.getDisplayName());
            return response;    
        }
        else {
        	throw new NccPortalException("Service with id " + id + " not found");
        }
        
    }
    
    
    
    }



	
	

