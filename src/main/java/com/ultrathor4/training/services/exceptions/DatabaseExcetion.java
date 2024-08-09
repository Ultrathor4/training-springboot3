package com.ultrathor4.training.services.exceptions;

public class DatabaseExcetion extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DatabaseExcetion(String msg) {
		super(msg);
	}
}
