package com.Opportunity_Management.Users;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	public void addUser(User user) {
		userRepo.save(user);
	}
	public boolean userExists(String email,String uName) {
		if(userRepo.findByEmailAndUName(email,uName).size()==0) {
			return false;
		}else {
			return true;
		}
		
		
	}
	public boolean login(String uName,String pass,HttpServletRequest request) {
		boolean log=false;
		List<User> user=userRepo.findByUsername(uName);
		if(user.size()>0) {
			 for(User u : user) {
		            if(u.getPassword().equals(pass)) {
		            	request.getSession().setAttribute("user",u.getUserId());
		            	log= true;
		            }else {
		            	log= false;
		            }
		        }
		}else {
			log = false;
		}
		return log;
	}
}
