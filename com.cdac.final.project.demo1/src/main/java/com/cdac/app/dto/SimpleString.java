package com.cdac.app.dto;

public class SimpleString {

	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "SimpleString [data=" + data + "]";
	}

	public SimpleString() {
		super();
	}

	public SimpleString(String data) {
		super();
		this.data = data;
	}

}
