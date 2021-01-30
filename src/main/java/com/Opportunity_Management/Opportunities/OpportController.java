package com.Opportunity_Management.Opportunities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Opportunity_Management.Accounts.Accounts;
import com.Opportunity_Management.Accounts.AccountsService;
import com.Opportunity_Management.Users.User;
@Controller
public class OpportController {
	@Autowired
	OppService oppService;
	@Autowired
	AccountsService accsService;
	@RequestMapping(method=RequestMethod.POST,value="/homepage/createOpp")
	public String saveOpp(@RequestParam(value="account") String account,Opportunities opp,Model model) {
		opp.setAccount(new Accounts(Integer.parseInt(account)," ","",new User()));
		oppService.addOpp(opp);
		model.addAttribute("allAccounts",accsService.getAccounts());
		model.addAttribute("accounts",accsService.getAccounts());
		model.addAttribute("opportunities",oppService.getOpportunities());
		return "homepage";
	}
	
	

}
