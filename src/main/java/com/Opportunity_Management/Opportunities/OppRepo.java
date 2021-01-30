package com.Opportunity_Management.Opportunities;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OppRepo extends CrudRepository<Opportunities, Integer> {
	public List<Opportunities> findAll();
}
