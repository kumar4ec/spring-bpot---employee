/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.employee.repository;

import com.example.employee.enitity.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

    @Query("select e FROM Employee e")
    List<Employee> fetchemployee();

    @Query(value = "SELECT * FROM Employee", nativeQuery = true)
    List<Employee> fetchemployeeNativeQuery();

    @Query("select e FROM Employee e ORDER BY e.firstName")
    List<Employee> fetchemployeeListOrderByName();

    //poistion paramaters
    @Query("select e FROM Employee e WHERE e.firstName = ?1")
    Employee fetchemployeeBYName(String name);

    @Query("SELECT e From Employee e where e.organization.organizationId = ?1 ")
    List<Employee> fetchEmployeeByOrgId(Integer organizationId);

    @Query("SELECT e From Employee e ORDER BY  e.salary")
    List<Employee> fetchEmployeeOrderBySalary();

    //Name parameters
    @Query("SELECT e From Employee e Where e.empId>=:min and e.empId<=:max")
    List<Employee> fetchEmployeeByIdRage(int min, int max);

    @Query("SELECT e From Employee e Where e.firstName IN(:name,:name1,:name2) ORDER BY e.firstName DESC")
    List<Employee> fetchEmployeeByEmpName(String name, String name1, String name2);
    
    //Specific column
    @Query("SELECT e.firstName, e.salary From Employee e ")
    List<Object[]> fetchEmployeeByNameAndSalary();

}
