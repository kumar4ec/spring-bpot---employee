/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employee.enitity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author USER
 */
@Table(name = "UserDetails")
@Entity
public class UserDetails implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO , generator ="UserDetails_TRG" )
    @SequenceGenerator(name = "UserDetails_TRG" ,sequenceName = "UserDetails_SEQ")
    @Column(name = "userId")
    private Integer userId;

    @Column(name = "userName", insertable = false)
    private String userName;

    /**
     * @return the userId
     */
    public Integer getUserId()
    {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    /**
     * @return the userName
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
}
