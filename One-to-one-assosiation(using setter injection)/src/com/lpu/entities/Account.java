package com.lpu.entities;

public class Account {
	private int accNo;
	private String accType;
	private String accName;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	@Override
	public String toString() {
		return getAccName() + " "+ getAccType();
	}
	
}
