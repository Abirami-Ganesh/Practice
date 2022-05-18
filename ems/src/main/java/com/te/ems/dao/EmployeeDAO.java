package com.te.ems.dao;

import com.te.ems.beans.EmployeeInfo;

public interface EmployeeDAO {
	
	public EmployeeInfo authenticate(Integer id, String password);
	
	public EmployeeInfo getEmployee(Integer id);
	
	public boolean delete(Integer id);
	
	public boolean register(EmployeeInfo info);
	
	public boolean update(EmployeeInfo newData);
}
