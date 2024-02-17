/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employee.testRunner;

import com.example.employee.enitity.SYSOrganization;
import com.example.employee.repository.SYSOrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author USER
 */
@Component
public class SYSOrganizationTestRunner implements CommandLineRunner
{

    @Autowired
    private SYSOrganizationRepository organizationRepository;  

    @Override
    public void run(String... args) throws Exception
    {
        //create Method
//        createOrganization();
    }
    
    
    /**
     * 
     * @return 
     */
    private SYSOrganization createOrganization()
    {
        SYSOrganization organization = new SYSOrganization();
        organization.setOrganizationName("Infoysy");
        organization.setDeleted(Boolean.FALSE);
        organizationRepository.save(organization);
        
        return organization;
        
    }
    
 
    
            
    
    
}
