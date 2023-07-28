package com.cglia.postcommentmappings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cglia.postcommentmappings.dto.OrderResponse;
import com.cglia.postcommentmappings.model.CustomerTab;
import com.cglia.postcommentmappings.repository.CustomerRepository;
import com.cglia.postcommentmappings.repository.ProductRepository;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	
	
	    @Autowired
	    private CustomerRepository customerRepository;
	    
	    @Autowired
	    private ProductRepository productRepository;

	    @PostMapping()
	    public CustomerTab placeOrder(@RequestBody CustomerTab request){
	       return customerRepository.save(request);
	    }

	    @GetMapping()
	    public List<CustomerTab> findAllOrders(){
	        return customerRepository.findAll();
	    }

	    @GetMapping("/getInfo")
	    public List<OrderResponse> getJoinInformation(){
	        return customerRepository.getJoinInformation();
	    }
	
}
