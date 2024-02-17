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
@Table
@Entity
public class Department
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentId", nullable = false)
    private Integer departmentId;

    @Column(name = "departmentName", length = 50, nullable = false)
    private String departmentName;

    @JoinColumn(name = "organizationId", referencedColumnName = "organizationId",
             foreignKey = @ForeignKey(name = "FK_Department_OrgId"))
    @ManyToOne(cascade = CascadeType.MERGE)
    private SYSOrganization organization;

    public Department(Integer departmentId)
    {
        this.departmentId = departmentId;
    }

    public Department()
    {

    }

    public Department(String departmentName, SYSOrganization organization)
    {
        this.departmentName = departmentName;
        this.organization = organization;
    }

    /**
     * @return the departmentId
     */
    public Integer getDepartmentId()
    {
        return departmentId;
    }

    /**
     * @param departmentId the departmentId to set
     */
    public void setDepartmentId(Integer departmentId)
    {
        this.departmentId = departmentId;
    }

    /**
     * @return the departmentName
     */
    public String getDepartmentName()
    {
        return departmentName;
    }

    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    /**
     * @return the organization
     */
    public SYSOrganization getOrganization()
    {
        return organization;
    }

    /**
     * @param organization the organization to set
     */
    public void setOrganization(SYSOrganization organization)
    {
        this.organization = organization;
    }
}
