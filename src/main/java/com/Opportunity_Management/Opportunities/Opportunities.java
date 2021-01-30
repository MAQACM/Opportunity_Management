package com.Opportunity_Management.Opportunities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.Opportunity_Management.Accounts.Accounts;

@Entity
@Table(name="Opportunities")
public class Opportunities {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer opportunity_Id;
	@Column(nullable=false)
	private String opportunity_Name;
	@ManyToOne
	private Accounts account;
	@Column(nullable=false)
	private String opportunity_amount;
	@Column(nullable=false)
	private String  opportunity_Stage;
	public Opportunities() {}
	public Opportunities(Integer opportunity_Id, String opportunity_Name, Accounts account, String opportunity_amount,
			String opportunity_Stage) {
		super();
		this.opportunity_Id = opportunity_Id;
		this.opportunity_Name = opportunity_Name;
		this.account = account;
		this.opportunity_amount = opportunity_amount;
		this.opportunity_Stage = opportunity_Stage;
	}
	
	public Integer getOpportunity_Id() {
		return opportunity_Id;
	}
	public void setOpportunity_Id(int opportunity_Id) {
		this.opportunity_Id = opportunity_Id;
	}
	public String getOpportunity_Name() {
		return opportunity_Name;
	}
	public void setOpportunity_Name(String opportunity_Name) {
		this.opportunity_Name = opportunity_Name;
	}
	public Accounts getAccount() {
		return account;
	}
	public void setAccount(Accounts account) {
		this.account = account;
	}
	public String getOpportunity_amount() {
		return opportunity_amount;
	}
	public void setOpportunity_amount(String opportunity_amount) {
		this.opportunity_amount = opportunity_amount;
	}
	public String getOpportunity_Stage() {
		return opportunity_Stage;
	}
	public void setOpportunity_Stage(String opportunity_Stage) {
		this.opportunity_Stage = opportunity_Stage;
	}

}
