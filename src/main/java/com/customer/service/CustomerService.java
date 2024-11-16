package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.customer.dao.CustomerDao;
import com.customer.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDao cd;
	
	@Autowired
	RestTemplate rt;

	public String post(List<Customer> li) {
		return cd.post(li);
	}

	public List<Customer> get() {
		return cd.get();
	}

	public String postname(List<Customer> li) {
		String url = "http://localhost:8082/bank/name/";

		li.forEach(x -> {
			String i = x.getIfc_code();
			ResponseEntity<String> ba = rt.exchange(url + i, HttpMethod.GET, null, String.class);
			String bankName = ba.getBody();

			x.setBank_name(bankName);

		});
		return cd.postname(li);
	}

}
