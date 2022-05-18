package com.te.ems.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_info")
public class EmployeeInfo implements Serializable{

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column
	private String mail;
	
	@Column(name = "password")
	private String pwd;
	
//	@DateTimeFormat(iso = ISO.DATE)
	@Column
	private Date dob;
	
	@Column
	private Long mobile;
	
}
