/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employee.schedular;

import com.example.employee.enitity.Employee;
import com.example.employee.repository.EmployeeRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author USER
 */
@Component
public class MyScheduledTask
{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Scheduled(fixedRate = 60000) // Run every 5 seconds
    public void fetchMethodForEveryFiveMins()
    {
        System.out.println("Date:" + new Date());
        System.out.println("Scheduled task executed at: " + System.currentTimeMillis());
        // Add your task logic here
        List<Employee> empList = employeeRepository.fetchemployee();

        for (Employee employee : empList)
        {
            System.out.println("getFirstName:" + employee.getFirstName());
            System.out.println("getOrganization:" + employee.getOrganization().getOrganizationName());
            System.out.println("getOrganization:" + employee.getOrganization().getOrganizationId());
//            System.out.println("getOrganization:" + employee.getOrganization().getDeleted());
        }
    }
    
    // Run every day at 1:30 AM
//    second minute hour day month dayOfWeek
    @Scheduled(cron = "0 30 1 * * *")
    public void myTask() {
        System.out.println("Scheduled task executed at: " + System.currentTimeMillis());
        // Add your task logic here
    }
    
//    Run every Monday and Friday at 12:00 PM
    @Scheduled(cron = "0 0 12 ? * MON,FRI")
    public void myTask1() {
        System.out.println("Scheduled task executed at: " + System.currentTimeMillis());
        // Add your task logic here
    }

}
