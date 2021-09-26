package com.tyv.ncc.springjwt.exceptions;

public class NccPortalException extends Exception {

	String message;
	public NccPortalException ( String msg) {
		super(msg);
	}
}
