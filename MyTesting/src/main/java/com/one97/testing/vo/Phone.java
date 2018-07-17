package com.one97.testing.vo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PersistenceContext;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;




@Entity
@DynamicInsert
@DynamicUpdate
public class Phone {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int phoneId;


	

	private String phoneNumber;
	private String phoneProvider;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneProvider() {
		return phoneProvider;
	}
	public void setPhoneProvider(String phoneProvider) {
		this.phoneProvider = phoneProvider;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber + ", phoneProvider=" + phoneProvider+"]";
	}
	
	
	
	
	
	
}
