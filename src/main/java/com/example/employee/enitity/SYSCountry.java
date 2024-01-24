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
@Entity
@Table(name = "SYSCountry")
public class SYSCountry implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="SYSCountry_TRG")
    @SequenceGenerator(name="SYSCountry_TRG", sequenceName="SYSCountry_SEQ")
    @Column(name = "countryId", nullable = false)
    private Short countryId;
    /**
     * 
     */
    @Column(name = "countryName", nullable = false, length = 50)
    private String countryName;
    /**
     * 
     */
    @Column(name = "countryCode", nullable = false, length = 7)
    private String countryCode;
    /**
     * 
     */
    @Column(name = "countryCodeISO", nullable = true, length = 2)
    private String countryCodeISO;
    /**
     * 
     */
    @Column(name = "deleted", nullable = false)
    private Boolean deleted;
    /**
     * 
     */
    @Column(name = "shortName", nullable = false, length = 5)
    private String shortName;

    /** Creates a new instance of SYSCountry */
    public SYSCountry()
    {
    }

    /**
     * Creates a new instance of SYSCountry with the specified values.
     * @param countryId the countryId of the SYSCountry
     */
    public SYSCountry(Short countryId)
    {
        this.countryId = countryId;
    }

    /**
     * Creates a new instance of SYSCountry with the specified values.
     * @param countryId the countryId of the SYSCountry
     * @param countryName the countryName of the SYSCountry
     */
    public SYSCountry(Short countryId, String countryName)
    {
        this.countryId = countryId;
        this.countryName = countryName;
    }

    /**
     * Gets the countryId of this SYSCountry.
     * @return the countryId
     */
    public Short getCountryId()
    {
        return this.countryId;
    }

    /**
     * Sets the countryId of this SYSCountry to the specified value.
     * @param countryId the new countryId
     */
    public void setCountryId(Short countryId)
    {
        this.countryId = countryId;
    }

    /**
     * Gets the countryName of this SYSCountry.
     * @return the countryName
     */
    public String getCountryName()
    {
        return this.countryName;
    }

    /**
     * Sets the countryName of this SYSCountry to the specified value.
     * @param countryName the new countryName
     */
    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    /**
     * @return the countryCode
     */
    public String getCountryCode()
    {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode)
    {
        this.countryCode = countryCode;
    }

    /**
     * Gets the deleted of this SYSCountry.
     * @return the deleted
     */
    public Boolean getDeleted()
    {
        return this.deleted;
    }

    /**
     * Sets the deleted of this SYSCountry to the specified value.
     * @param deleted the new deleted
     */
    public void setDeleted(Boolean deleted)
    {
        this.deleted = deleted;
    }

    /**
     * Returns a hash code value for the object.  This implementation computes
     * a hash code value based on the id fields in this object.
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (this.countryId != null ? this.countryId.hashCode() : 0);
        return hash;
    }

    /**
     * Determines whether another object is equal to this SYSCountry.  The result is
     * <code>true</code> if and only if the argument is not null and is a SYSCountry object that
     * has the same id field values as this object.
     * @param object the reference object with which to compare
     * @return <code>true</code> if this object is the same as the argument;
     * <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SYSCountry))
        {
            return false;
        }
        SYSCountry other = (SYSCountry) object;
        if (this.countryId != other.countryId && (this.countryId == null || !this.countryId.equals(other.countryId)))
        {
            return false;
        }
        return true;
    }

    /**
     * Returns a string representation of the object.  This implementation constructs
     * that representation based on the id fields.
     * @return a string representation of the object.
     */
    @Override
    public String toString()
    {
        return "com.infomindz.platform.dal.jpa.entities.systemmanagement.SYSCountry[countryId=" + countryId + "]";
    }

    /**
     * @return the shortName
     */
    public String getShortName()
    {
        return shortName;
    }

    /**
     * @param shortName the shortName to set
     */
    public void setShortName(String shortName)
    {
        this.shortName = shortName;
    }

    public String getCountryCodeISO()
    {
        return countryCodeISO;
    }

    public void setCountryCodeISO(String countryCodeISO)
    {
        this.countryCodeISO = countryCodeISO;
    }
}

