package  com.tyv.ncc.springjwt.controllers;


import com.tyv.ncc.springjwt.exceptions.NccPortalException;
import com.tyv.ncc.springjwt.payload.request.ServiceRegisterRequest;
import com.tyv.ncc.springjwt.payload.response.MessageResponse;
import com.tyv.ncc.springjwt.payload.response.ServiceResponse;
import com.tyv.ncc.springjwt.service.ServicesService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/services")
public class ServiceController {

   

    @Autowired
    private ServicesService servicesService;

	

	@PostMapping("/register")
	public ResponseEntity<?> registerService( @RequestBody ServiceRegisterRequest serviceRegisterRequest) {
	
		try {
			servicesService.createNewService(serviceRegisterRequest);
			return  new ResponseEntity<>(new MessageResponse("Service registered successfully!"),HttpStatus.OK);
		} catch (NccPortalException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(new MessageResponse("Service Already Available !"),HttpStatus.BAD_REQUEST);

		}
		
	
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<?> updateService( @RequestBody ServiceRegisterRequest serviceRegisterRequest) {
	
		try {
			servicesService.updateService(serviceRegisterRequest);
			return  new ResponseEntity<>(new MessageResponse("Service updated successfully!"),HttpStatus.OK);
		} catch (NccPortalException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(new MessageResponse("Service not Available"),HttpStatus.BAD_REQUEST);

		}
		
		
	}
	
	
	
	@GetMapping("/{serviceId}")
	public ResponseEntity<?> getService(@PathVariable("serviceId") long serviceId) {
		
		try {
			ServiceResponse response =servicesService.getService(serviceId);
			return  new ResponseEntity<>(response,HttpStatus.OK);

		} catch (NccPortalException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(new MessageResponse(e.getMessage()),HttpStatus.BAD_REQUEST);

		}
		
	}
	

	
	   

}
