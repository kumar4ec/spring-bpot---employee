/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employee.enitity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author USER
 */
@Entity
@Table
public class CustomerOrder
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId", nullable = false)
    private Integer orderId;
    @Column(name = "orderName" , length = 100,nullable = false)
    private String orderName;
    
    @JoinColumn(name = "customerId" , referencedColumnName = "customerId" ,foreignKey = @ForeignKey(name = "FK_Order_CUSID"))
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    public CustomerOrder(String orderName, Customer customer)
    {
        this.orderName = orderName;
        this.customer = customer;
    }

    /**
     * @return the orderId
     */
    public Integer getOrderId()
    {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(Integer orderId)
    {
        this.orderId = orderId;
    }

    /**
     * @return the orderName
     */
    public String getOrderName()
    {
        return orderName;
    }

    /**
     * @param orderName the orderName to set
     */
    public void setOrderName(String orderName)
    {
        this.orderName = orderName;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer()
    {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
}
