package com.lezurex.overcomplicated.skinwalker;

public class SkinWalkerException extends RuntimeException {

	public SkinWalkerException() {
		super();
	}

	public SkinWalkerException(String msg) {
		super(msg);
	}

	public SkinWalkerException(Throwable cause) {
		super(cause);
	}

	public SkinWalkerException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
