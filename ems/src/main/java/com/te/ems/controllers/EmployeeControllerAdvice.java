package com.te.ems.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.ems.customeexception.EmployeeException;
import com.te.ems.customeexception.EntityNotFoundExp;

@ControllerAdvice
public class EmployeeControllerAdvice {

	@ExceptionHandler(EmployeeException.class)
	public String handleEE(EmployeeException exp ,HttpServletRequest req ) {
		req.setAttribute("err", exp.getMessage());
		return "LoginForm";
	}
	
	@ExceptionHandler(EntityNotFoundExp.class)
	public String handleENF(EntityNotFoundExp exp,HttpServletRequest req) {
		req.setAttribute("msg",exp.getMessage() );
		return "delete";
	}
}
