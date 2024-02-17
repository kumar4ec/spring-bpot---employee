/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employee.testRunner;

import com.example.employee.enitity.UserDetails;
import com.example.employee.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 *
 * @author USER
 */
@Component
public class UserDetailsTestRunner implements CommandLineRunner
{

    @Autowired
    private UserDetailsRepository userDetailsRepository;
    
    @Override
    public void run(String... args) throws Exception
    {
//        createUser();
    }
    
    private void createUser()
    {
        UserDetails userDetails = new UserDetails();
        userDetails.setUserName("kumar");
        userDetailsRepository.save(userDetails);
    }
    
}
