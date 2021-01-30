package com.Opportunity_Management.Opportunities;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OppService {
	@Autowired
	OppRepo opp;
	public List<Opportunities> getOpportunities(){
		List<Opportunities> opps=new ArrayList<>();
		opps= opp.findAll();
		
		return opps;
	}
	public void addOpp(Opportunities opport) {
		opp.save(opport);
	}
 
}
