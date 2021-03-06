package com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PEOPLE_CT20182390356")
public class People {
	@Id
	private String aadharNumber;
	private String PANNumber;
	private String Name;
	private int monthlyIncome;
	
	
	public People(String aadharNumber, String pANNumber, String name, int monthlyIncome) {
		super();
		this.aadharNumber = aadharNumber;
		PANNumber = pANNumber;
		Name = name;
		this.monthlyIncome = monthlyIncome;
	}
	public People() {
		super();
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getPANNumber() {
		return PANNumber;
	}
	public void setPANNumber(String pANNumber) {
		PANNumber = pANNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(int monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	
	
	

}
