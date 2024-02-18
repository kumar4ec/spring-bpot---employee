/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.employee.repository;

import com.example.employee.enitity.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
 
    @Query("SELECT c.customerId,c.customerName,o.orderId,o.orderName FROM Customer c LEFT JOIN  c.customerOrders o")
    List<Object[]> fetchCustomerAll(Integer id);
}
