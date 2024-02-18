/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employee.testRunner;

import com.example.employee.repository.CustomerRepository;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author USER
 */
@Component
public class CustomerTestRunner implements CommandLineRunner
{

    @Autowired
    private CustomerRepository customerRepository; 
    @Override
    public void run(String... args) throws Exception
    {
//        fetchCustomerByOrder();
    }
    
    private void fetchCustomerByOrder()
    {
        List<Object[]> list = customerRepository.fetchCustomerAll(1);
        System.out.println("list:" + list);
        if (CollectionUtils.isNotEmpty(list))
        {
            for (Object[] objects : list)
            {
                System.out.println("customerId:" + (Integer) objects[0]);
                System.out.println("customer Name:" + (String) objects[1]);
                System.out.println("order ID:" + (Integer) objects[2]);
                System.out.println("order name:" + (String) objects[3]);
            }
        }
    }
    
}
