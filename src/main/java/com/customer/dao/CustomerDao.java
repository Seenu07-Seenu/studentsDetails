package com.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.customer.entity.Customer;
import com.customer.repository.CustomerRepository;

@Repository
public class CustomerDao {

	@Autowired
	CustomerRepository cr;

	public String post(List<Customer> li) {
		 cr.saveAll(li);
		 return "Save";
	}

	public List<Customer> get() {
		return cr.findAll();
	}

	public String postname(List<Customer> li) {
		 cr.saveAll(li);
		 return "saved";
	}
	

}
