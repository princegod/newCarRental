package com.myrentalproject.model.user;
import java.util.Date;
import javax.persistence.*;

import com.myrentalproject.model.places.Branch;


@Entity
public class Employee extends User{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Eid;
	
	private Date joingDate;
	private Branch branch;
	
	public Date getJoingDate() {
		return joingDate;
	}
	public void setJoingDate(Date joingDate) {
		this.joingDate = joingDate;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	private String Role;
	
	

}
