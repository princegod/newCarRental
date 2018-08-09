package com.myrentalproject.model.places;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Branch {
	@Id
	@GeneratedValue
	private int BranchId;
	private String name;
	private String contach;
	private String faxnumber;
	private Location location;
	
	public Branch(){
		
	}
	public Branch(String name, String contach, String faxnumber,
			Location location) {
		super();
		this.name = name;
		this.contach = contach;
		this.faxnumber = faxnumber;
		this.location = location;
	}
	public int getBranchId() {
		return BranchId;
	}
	public void setBranchId(int branchId) {
		BranchId = branchId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContach() {
		return contach;
	}
	public void setContach(String contach) {
		this.contach = contach;
	}
	public String getFaxnumber() {
		return faxnumber;
	}
	public void setFaxnumber(String faxnumber) {
		this.faxnumber = faxnumber;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	

}
