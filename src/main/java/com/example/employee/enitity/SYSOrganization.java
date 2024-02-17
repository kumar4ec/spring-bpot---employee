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

/**
 *
 * @author USER
 */
@Entity
@Table
public class SYSOrganization
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO , generator = "SYSOrganization_TRG")
    @SequenceGenerator(name = "SYSOrganization_TRG" , sequenceName = "SYSOrganization_SEQ")
    @Column(name = "organizationId", nullable = false)
    private Short organizationId;
    /**
     *
     */
    @Column(name = "organizationName", nullable = false)
    private String organizationName;
    /**
     *
     */
    @Column(name = "deleted", nullable = false)
    private Boolean deleted;
    
//    @OneToMany(mappedBy = "organization")
//    private Employee employee;

    /**
     * @return the organizationId
     */
    public Short getOrganizationId()
    {
        return organizationId;
    }

    /**
     * @param organizationId the organizationId to set
     */
    public void setOrganizationId(Short organizationId)
    {
        this.organizationId = organizationId;
    }

    /**
     * @return the organizationName
     */
    public String getOrganizationName()
    {
        return organizationName;
    }

    /**
     * @param organizationName the organizationName to set
     */
    public void setOrganizationName(String organizationName)
    {
        this.organizationName = organizationName;
    }

    /**
     * @return the deleted
     */
    public Boolean getDeleted()
    {
        return deleted;
    }

    /**
     * @param deleted the deleted to set
     */
    public void setDeleted(Boolean deleted)
    {
        this.deleted = deleted;
    }

//    /**
//     * @return the organization
//     */
//    public Employee getOrganization()
//    {
//        return organization;
//    }
//
//    /**
//     * @param organization the organization to set
//     */
//    public void setOrganization(Employee organization)
//    {
//        this.organization = organization;
//    }

}
