package com.Opportunity_Management.Accounts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AccountsService {
	@Autowired   
	accountsRepo accRepo;
	public List<Accounts> getAccounts(){
		List<Accounts> accounts=new ArrayList<>();
		accounts= accRepo.findAll();
		return accounts;
	}
	public void addAccounts(Accounts account) {
		accRepo.save(account);
	}
}
