package com.example.flexcubeinnovation.dto;

import java.time.LocalDate;


public class AccountDto {
    private int accountId;
    private String fullName;
    private String accountStatus;
    private LocalDate acctOpenDate;
    private int availBal;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public LocalDate getAcctOpenDate() {
		return acctOpenDate;
	}
	public void setAcctOpenDate(LocalDate acctOpenDate) {
		this.acctOpenDate = acctOpenDate;
	}
	public int getAvailBal() {
		return availBal;
	}
	public void setAvailBal(int availBal) {
		this.availBal = availBal;
	}
	public AccountDto(int accountId, String fullName, String accountStatus, LocalDate acctOpenDate, int availBal) {
		super();
		this.accountId = accountId;
		this.fullName = fullName;
		this.accountStatus = accountStatus;
		this.acctOpenDate = acctOpenDate;
		this.availBal = availBal;
	}
	public AccountDto() {
		// TODO Auto-generated constructor stub
	}
    
}
