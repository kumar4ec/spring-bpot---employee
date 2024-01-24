/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.employee.repository;

import com.example.employee.enitity.SYSOrganization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public interface SYSOrganizationRepository extends JpaRepository<SYSOrganization, Short>
{
    
}
