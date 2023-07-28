package com.cglia.postcommentmappings.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cglia.postcommentmappings.dto.OrderResponse;
import com.cglia.postcommentmappings.model.CustomerTab;

public interface CustomerRepository extends JpaRepository<CustomerTab,Integer> {

	 @Query("SELECT new com.cglia.postcommentmappings.dto.OrderResponse(c.name , p.productName) FROM CustomerTab c JOIN c.products p")
	 public List<OrderResponse> getJoinInformation();


}
