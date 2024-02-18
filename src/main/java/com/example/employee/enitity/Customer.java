/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employee.enitity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author USER
 */
@Entity
@Table
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId" , nullable = false)
    private Integer customerId;
    @Column(name = "customerName" ,length = 50,nullable = false)
    private String customerName;
    
    @OneToMany(mappedBy = "customer" , cascade = CascadeType.ALL)
    private List<CustomerOrder>customerOrders;

    public Customer(String customerName)
    {
        this.customerName = customerName;
    }

    /**
     * @return the customerId
     */
    public Integer getCustomerId()
    {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(Integer customerId)
    {
        this.customerId = customerId;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName()
    {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    /**
     * @return the customerOrders
     */
    public List<CustomerOrder> getCustomerOrders()
    {
        return customerOrders;
    }

    /**
     * @param customerOrders the customerOrders to set
     */
    public void setCustomerOrders(List<CustomerOrder> customerOrders)
    {
        this.customerOrders = customerOrders;
    }
}
