package com.MyProject.ECommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyProject.ECommerce.Models.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Integer, Customer>{

}
