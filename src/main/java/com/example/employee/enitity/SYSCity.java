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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author USER
 */
@Entity
@Table
public class SYSCity
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="SYSCity_TRG")
    @SequenceGenerator(name="SYSCity_TRG", sequenceName="SYSCity_SEQ")
    @Column(name = "cityId", nullable = false)
    private Integer cityId;
    /**
     * 
     */
    @Column(name = "cityName", nullable = false, length=50)
    private String cityName;
    /**
     * 
     */
    @JoinColumn(name = "stateId", referencedColumnName = "stateId",nullable=false,foreignKey = @jakarta.persistence.ForeignKey(name="FK_SYSCity_SYSState"))
    @ManyToOne
    private SYSState stateId;
    /**
     * 
     */
    @Column(name = "deleted", nullable = false)
    private Boolean deleted;

    /** Creates a new instance of SYSCity */
    public SYSCity()
    {
    }

    /**
     * Creates a new instance of SYSCity with the specified values.
     * @param cityId the cityId of the SYSCity
     */
    public SYSCity(Integer cityId)
    {
        this.cityId = cityId;
    }

    /**
     * Creates a new instance of SYSCity with the specified values.
     * @param cityId the cityId of the SYSCity
     * @param cityName the cityName of the SYSCity
     */
    public SYSCity(Integer cityId, String cityName)
    {
        this.cityId = cityId;
        this.cityName = cityName;
    }

    /**
     * Gets the cityId of this SYSCity.
     * @return the cityId
     */
    public Integer getCityId()
    {
        return this.cityId;
    }

    /**
     * Sets the cityId of this SYSCity to the specified value.
     * @param cityId the new cityId
     */
    public void setCityId(Integer cityId)
    {
        this.cityId = cityId;
    }

    /**
     * Gets the cityName of this SYSCity.
     * @return the cityName
     */
    public String getCityName()
    {
        return this.cityName;
    }

    /**
     * Sets the cityName of this SYSCity to the specified value.
     * @param cityName the new cityName
     */
    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    /**
     * Gets the stateId of this SYSCity.
     * @return the stateId
     */
    public SYSState getStateId()
    {
        return this.stateId;
    }

    /**
     * Sets the stateId of this SYSCity to the specified value.
     * @param stateId the new stateId
     */
    public void setStateId(SYSState stateId)
    {
        this.stateId = stateId;
    }

    /**
     * Gets the deleted of this SYSCity.
     * @return the deleted
     */
    public Boolean getDeleted()
    {
        return this.deleted;
    }

    /**
     * Sets the deleted of this SYSCity to the specified value.
     * @param deleted the new deleted
     */
    public void setDeleted(Boolean deleted)
    {
        this.deleted = deleted;
    }

}
