package com.example.employee.enitity;

import com.example.employee.constants.EmployeeStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;

	@Column(name = "firstName", nullable = true, length = 255)
	private String firstName;

	@Column(name = "lastName", nullable = true, length = 255)
	private String lastName;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "status")
	private EmployeeStatus employeeStatus;

	@Column(name = "salary")
	private Double salary;
        
        @OneToOne(cascade = CascadeType.MERGE)
        @JoinColumn(name = "organizationId" , referencedColumnName = "organizationId")
        @OnDelete(action = OnDeleteAction.CASCADE)
        private SYSOrganization organization;
        
        @OneToOne(cascade = CascadeType.MERGE)
        @JoinColumn(name = "departmentId" , referencedColumnName = "departmentId"
        ,foreignKey = @ForeignKey(name = "FK_Department_DeptId"))
        @OnDelete(action = OnDeleteAction.CASCADE)
        private Department department;

	public Employee() {

	}

	public Employee(String firstName, String lastName,EmployeeStatus employeeStatus,
			Double salary ,SYSOrganization organization,Department department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeStatus = employeeStatus;
		this.salary = salary;
                this.organization = organization;
                this.department = department;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + ", salary=" + salary + "]";
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
