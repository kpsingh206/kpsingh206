package com.one97.testing.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="employeedetails")
public class Employee {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	String firstName;
	String lastName;
	

	@OneToMany(cascade= CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="employee",orphanRemoval=true)
//	@JoinTable(name="phone",joinColumns= {@JoinColumn(name="employee_id",referencedColumnName="id")},inverseJoinColumns=@JoinColumn(name="phone_id",referencedColumnName="phoneId"))
//	@JoinColumn(name="employee_id")
    @OrderBy(value="employee_id")
	@MapKey(name="phoneNumber")
	private Map<String,Phone> phone = new HashMap<>();
//	private List<Phone> phone = new ArrayList<>();

	public int getId() {
		return id;
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

/*	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}
*/
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName +  "]";
	}

	public Map<String, Phone> getPhone() {
		return phone;
	}

	public void setPhone(Map<String, Phone> phone) {
		this.phone = phone;
	}


}

