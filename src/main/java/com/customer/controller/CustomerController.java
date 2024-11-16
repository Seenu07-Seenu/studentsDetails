package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.customer.entity.Customer;
import com.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService cs;

	@PostMapping("/postvalue")
	public String post(@RequestBody List<Customer> li) {
		return cs.post(li);
	}

	@GetMapping("/getvalue")
	public List<Customer> get() {
		return cs.get();
	}

	@PostMapping("/postname")
	public String postname(@RequestBody List<Customer> li) {
		return cs.postname(li);
	}

}
