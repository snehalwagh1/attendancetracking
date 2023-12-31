
package com.zoho.attendance.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;



@Entity(name = "useraccount")
public class UserAccount {

	@Id
	@Column(name = "type", length = 50)
	@NotEmpty(message = "*Please provide your id")
    String	type;

	@Column(name = "password", length = 50)
	@NotEmpty(message = "*Please provide your PASSWORD")
    String password;    
    
	@Column(name = "employeeId", length = 50)
	@NotEmpty(message = "*Please provide your EMPLOYEE ID")
    String employeeId;

    public String getType() {
        return type;
    }

    public void setType(String username) {
    	this.type = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


}