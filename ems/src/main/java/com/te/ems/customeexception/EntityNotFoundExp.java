package com.te.ems.customeexception;

public class EntityNotFoundExp  extends RuntimeException{

	public EntityNotFoundExp(String msg) {
		super(msg);
	}
}
