package com.Opportunity_Management.Accounts;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Opportunity_Management.Opportunities.OppService;
import com.Opportunity_Management.Users.User;

@Controller
public class AccountsController {
	@Autowired
	OppService oppService;
	@Autowired
	AccountsService accsService;
	
	@RequestMapping(method=RequestMethod.POST,value="/homepage/createAcc")
	public String saveAcc(Accounts acc,HttpSession session,Model model) {
		acc.setUser(new User((Integer) session.getAttribute("user"), "","",""));
		accsService.addAccounts(acc);
		model.addAttribute("allAccounts",accsService.getAccounts());
		model.addAttribute("accounts",accsService.getAccounts());
		model.addAttribute("opportunities",oppService.getOpportunities());
		return "homepage";
	}
	

}
