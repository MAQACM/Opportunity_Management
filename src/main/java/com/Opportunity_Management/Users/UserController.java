package com.Opportunity_Management.Users;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Opportunity_Management.Accounts.AccountsService;
import com.Opportunity_Management.Opportunities.OppService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	OppService oppService;
	@Autowired
	AccountsService accsService;
	@GetMapping("/")
	public String homePage() {
		return "login";
	}
	@PostMapping("/login")
	public String login(@RequestParam(value="userName") String uName,@RequestParam(value="password") String pass ,Model model,HttpServletRequest request) {
		if(userService.login(uName, pass,request)) {
			model.addAttribute("allAccounts",accsService.getAccounts());
			model.addAttribute("accounts",accsService.getAccounts());
			model.addAttribute("opportunities",oppService.getOpportunities());
			return "homepage";
		}else {
			model.addAttribute("err","Wrong password or username. If you don't have account register.");
			return "login";
		}
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	@PostMapping("/registration")
	public String registration(@RequestParam(value="email") String email,@RequestParam(value="userName") String uName,@RequestParam(value="password") String pass,@RequestParam(value="cPassword") String cPass,Model model,User user) {
		if(pass.equals(cPass)) {
			if(!userService.userExists(email, uName)) {
				userService.addUser(user);
				return "login";
			}else {
				model.addAttribute("err","Account Exists !!!");
				return "register"; 
			}
			
		}else {
			model.addAttribute("err","Passwords Don't match !!!");
			return "register";
		}
		
		
	}

}
