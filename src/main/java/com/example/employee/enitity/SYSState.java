/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employee.enitity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "SYSState")
public class SYSState implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="SYSState_TRG")
    @SequenceGenerator(name="SYSState_TRG", sequenceName="SYSState_SEQ")
    @Column(name = "stateId", nullable = false)
    private Integer stateId;
    /**
     * 
     */
    @Column(name = "stateName", nullable = false, length = 50)
    private String stateName;
    /**
     * 
     */
    @JoinColumn(name = "countryId", referencedColumnName = "countryId", nullable = false,
            foreignKey = @ForeignKey(name = "FK_SYSState_SYSCountry"))
    @ManyToOne
    private SYSCountry countryId;
    /**
     * 
     */
    @Column(name = "deleted", nullable = false)
    private Boolean deleted;
    /**
     *
     */
    @Column(name = "stateCode", length = 6, nullable = true)
    private String stateCode;

    /** Creates a new instance of SYSState */
    public SYSState()
    {
    }

    /**
     * Creates a new instance of SYSState with the specified values.
     * @param stateId the stateId of the SYSState
     */
    public SYSState(Integer stateId)
    {
        this.stateId = stateId;
    }

    /**
     * Creates a new instance of SYSState with the specified values.
     * @param stateId the stateId of the SYSState
     * @param stateName the stateName of the SYSState
     */
    public SYSState(Integer stateId, String stateName)
    {
        this.stateId = stateId;
        this.stateName = stateName;
    }

    /**
     * Gets the stateId of this SYSState.
     * @return the stateId
     */
    public Integer getStateId()
    {
        return this.stateId;
    }

    /**
     * Sets the stateId of this SYSState to the specified value.
     * @param stateId the new stateId
     */
    public void setStateId(Integer stateId)
    {
        this.stateId = stateId;
    }

    /**
     * Gets the stateName of this SYSState.
     * @return the stateName
     */
    public String getStateName()
    {
        return this.stateName;
    }

    /**
     * Sets the stateName of this SYSState to the specified value.
     * @param stateName the new stateName
     */
    public void setStateName(String stateName)
    {
        this.stateName = stateName;
    }

    /**
     * Gets the countryId of this SYSState.
     * @return the countryId
     */
    public SYSCountry getCountryId()
    {
        return this.countryId;
    }

    /**
     * Sets the countryId of this SYSState to the specified value.
     * @param countryId the new countryId
     */
    public void setCountryId(SYSCountry countryId)
    {
        this.countryId = countryId;
    }

    /**
     * Gets the deleted of this SYSState.
     * @return the deleted
     */
    public Boolean getDeleted()
    {
        return deleted;
    }

    /**
     * Sets the deleted of this SYSState to the specified value.
     * @param deleted the new deleted
     */
    public void setDeleted(Boolean deleted)
    {
        this.deleted = deleted;
    }
}

