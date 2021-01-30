package com.Opportunity_Management.Accounts;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface accountsRepo extends CrudRepository<Accounts, Integer> {
	public List<Accounts> findAll();

}
