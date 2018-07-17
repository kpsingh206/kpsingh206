package com.one97.testing.vo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="user_type")

@SequenceGenerator(name="seq",allocationSize=100,initialValue=1)
@TableGenerator(name="tab",table="mygene",pkColumnName="gen",valueColumnName="ddd",initialValue=1,allocationSize=2)
public abstract class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="tab")
	@Column(name = "id", updatable = false, nullable = false)
	protected int id;

	private String email;


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}
