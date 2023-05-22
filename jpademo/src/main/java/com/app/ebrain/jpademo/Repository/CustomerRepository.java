package com.app.ebrain.jpademo.Repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.ebrain.jpademo.entity.CustomerEntity;
@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, UUID>{

}
