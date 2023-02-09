package com.mapping1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BAnkAccount")
public class BankAccount {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int AccNo;
	@Column(name = "type")
	private String type;
	
	
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "BankAccount [AccNo=" + AccNo + ", type=" + type + "]";
	}
	
	
	
	
	

}
