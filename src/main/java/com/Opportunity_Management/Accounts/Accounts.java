package com.Opportunity_Management.Accounts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.Opportunity_Management.Users.User;

@Entity
@Table(name="Accounts")
public class Accounts {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer accounts_Id;
	@Column(nullable=false)
	private String account_Name;
	@Column(nullable=false)
	private String account_Address;
	@ManyToOne
	private  User user;
	public Accounts(int accounts_Id, String account_Name, String account_Address, User user) {
		super();
        this.accounts_Id = accounts_Id;
		this.account_Name = account_Name;
		this.account_Address = account_Address;
		this.user = user;
	}
	public Accounts() {}
	
	public Integer getAccounts_Id() {
		return accounts_Id;
	}
	public void setAccounts_Id(int accounts_Id) {
		this.accounts_Id = accounts_Id;
	}
	public String getAccount_Name() {
		return account_Name;
	}
	public void setAccount_Name(String account_Name) {
		this.account_Name = account_Name;
	}
	public String getAccount_Address() {
		return account_Address;
	}
	public void setAccount_Address(String account_Address) {
		this.account_Address = account_Address;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
     
}
