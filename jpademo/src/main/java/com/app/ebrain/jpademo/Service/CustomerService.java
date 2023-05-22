package com.app.ebrain.jpademo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ebrain.jpademo.Repository.CustomerRepository;
import com.app.ebrain.jpademo.entity.CustomerEntity;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRespository;
	
	public CustomerEntity save(CustomerEntity customerEntity) {
		
		return customerRespository.save(customerEntity);
	}

}
