package com.myrentalproject.model.user;
import javax.persistence.*;
@Entity
public class Driver extends Employee {
	@Id
	private String LicenaceNo;

	public String getLicenaceNo() {
		return LicenaceNo;
	}

	public void setLicenaceNo(String licenaceNo) {
		LicenaceNo = licenaceNo;
	}

}
