/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employee.testRunner;

import com.example.employee.constants.EmployeeStatus;
import com.example.employee.enitity.Employee;
import com.example.employee.enitity.SYSOrganization;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.repository.SYSOrganizationRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author USER
 */
@Component

public class EmployeeTestRunner implements CommandLineRunner
{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SYSOrganizationRepository sYSOrganizationRepository;

    @Override
    public void run(String... args) throws Exception
    {
        fetchEmployeeALL();
//        createEmployee();
//        fetchEmployeeByOrgId();
//        fetchEmployeeByName();
//        fetchIndivialEmployee();
//        fetchEmployeeByIdRage();

//        fetchEmployeeByNativeQuery();
//        fetchEmployeeByEmpName();
//        fetchEmployeeByNameAndSalary();
    }
    
    /**
     * 
     */
    private void fetchEmployeeByNameAndSalary()
    {
       List<Object[]>list =  employeeRepository.fetchEmployeeByNameAndSalary();
        for (Object[] objects : list)
        {
            System.out.println("name:"+(String)objects[0]);
            System.out.println("salary:"+(Double)objects[1]);
        }
    }

    /**
     * 
     */
    private void fetchEmployeeByNativeQuery()
    {
        List<Employee> empList = employeeRepository.fetchemployeeNativeQuery();
        for (Employee employee : empList)
        {
            System.out.println("getFirstName:" + employee.getFirstName());
            System.out.println("getOrganization:" + employee.getOrganization().getOrganizationName());
        }
    }

    /**
     * 
     */
    private void fetchEmployeeByEmpName()
    {
        List<Employee> empList = employeeRepository.fetchEmployeeByEmpName("kumar", "dinesh", "anu");
        for (Employee employee : empList)
        {
            System.out.println("getFirstName:" + employee.getFirstName());
            System.out.println("getOrganization:" + employee.getOrganization().getOrganizationName());
        }
    }

    //to create Employee
    private void createEmployee()
    {
        // To create employee
        //To get tcs Organization
        Optional<SYSOrganization> optional = sYSOrganizationRepository.findById((short) 2);

        SYSOrganization organization = null;
        if (optional != null)
        {
            organization = optional.get();
        }
        System.err.println("organization:" + organization);

        employeeRepository.save(new Employee("Ramya", "Padmanaban", "Developer", EmployeeStatus.PERMANANT, 10000.0, organization));
        employeeRepository.save(new Employee("Sindhu", "", "Developer", EmployeeStatus.PERMANANT, 11000.0, organization));
        employeeRepository.save(new Employee("anu", "", "Developer", EmployeeStatus.PROBATION, 12000.0, organization));
        employeeRepository.save(new Employee("anjali", "", "Developer", EmployeeStatus.PROBATION, 5000.0, organization));
        employeeRepository.save(new Employee("seeni", "", "Developer", EmployeeStatus.PROBATION, 10000.0, organization));
        employeeRepository.save(new Employee("promoth", "", "Developer", EmployeeStatus.PROBATION, 5500.0, organization));

    }

    // 
    private void fetchEmployeeALL()
    {
        System.out.println("com.example.employee.testRunner.EmployeeTestRunner.fetchEmployeeALL()");
        List<Employee> empList = employeeRepository.fetchemployee();

        for (Employee employee : empList)
        {
            System.out.println("getFirstName:" + employee.getFirstName());
            System.out.println("getOrganization:" + employee.getOrganization().getOrganizationName());
            System.out.println("getOrganization:" + employee.getOrganization().getOrganizationId());
//            System.out.println("getOrganization:" + employee.getOrganization().getDeleted());
        }
    }

    // 
    private void fetchEmployeeOrderByName()
    {
        List<Employee> empList = employeeRepository.fetchemployeeListOrderByName();

        for (Employee employee : empList)
        {
            System.out.println("getFirstName:" + employee.getFirstName());
            System.out.println("getOrganization:" + employee.getOrganization().getOrganizationName());
        }
    }

    private void fetchIndivialEmployee()
    {
        Employee employee = employeeRepository.fetchemployeeBYName("kumar");
        System.out.println("getFirstName:" + employee.getFirstName());
        System.out.println("getOrganization:" + employee.getOrganization().getOrganizationName());
    }

    private void fetchEmployeeByOrgId()
    {
        List<Employee> empList = employeeRepository.fetchEmployeeByOrgId(2);
//
        for (Employee employee : empList)
        {
            System.out.println("getFirstName:" + employee.getFirstName());
            System.out.println("getOrganization:" + employee.getOrganization().getOrganizationName());
        }
    }

    private void fetchEmployeeByIdRage()
    {
        List<Employee> empList = employeeRepository.fetchEmployeeByIdRage(1, 5);
        for (Employee employee : empList)
        {
            System.out.println("getFirstName:" + employee.getFirstName());
            System.out.println("getOrganization:" + employee.getOrganization().getOrganizationName());
        }
    }

}
