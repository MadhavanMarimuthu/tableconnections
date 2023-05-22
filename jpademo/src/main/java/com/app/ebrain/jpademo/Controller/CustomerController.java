package com.app.ebrain.jpademo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ebrain.jpademo.Service.CustomerService;
import com.app.ebrain.jpademo.entity.CustomerEntity;

@RestController
@RequestMapping("/CustomerController")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value = "/post")
	private CustomerEntity Customer(@RequestBody CustomerEntity  customerEntity)
	{
		 return  customerService.save(customerEntity);	 
		
	}	

}
