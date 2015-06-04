package application.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	@RequestMapping("/new")
	public String newUser(){
		return "new";
	}
	
	@RequestMapping(value = "/create", method=RequestMethod.POST)
	public String createUser(HttpServletRequest req, Model model){
		model.addAttribute("last_name", req.getParameter("last_name"));
		model.addAttribute("first_name", req.getParameter("first_name"));
		model.addAttribute("email", req.getParameter("email"));
		model.addAttribute("location", req.getParameter("location"));
		model.addAttribute("why", req.getParameter("why"));
		return "result";
	}
}
