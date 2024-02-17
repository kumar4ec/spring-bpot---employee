/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employee.repository;

import com.example.employee.enitity.Department;
import com.example.employee.enitity.SYSOrganization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author USER
 */
@Component
public class DepartmentTestRunner implements CommandLineRunner
{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private SYSOrganizationRepository organizationRepository;

    @Override
    public void run(String... args) throws Exception
    {
//        createDepartment();
    }

    private void createDepartment()
    {
        SYSOrganization organization = organizationRepository.findById((short) 1).get();
        
        departmentRepository.save(new Department("Java developer" , organization));
        departmentRepository.save(new Department("Testing" , organization));
        departmentRepository.save(new Department("HR" , organization));
        departmentRepository.save(new Department("Management" , organization));
    }

}
