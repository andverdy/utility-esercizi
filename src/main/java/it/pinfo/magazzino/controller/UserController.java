package it.pinfo.magazzino.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.pinfo.magazzino.entity.User;
import it.pinfo.magazzino.service.UserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {

	@Autowired
	private UserService operatorService;

	@GetMapping("/getId-byEmail")
	public Integer getIdByEmail(@RequestParam String username) {
		return this.operatorService.findByUsername(username).getId();
	}
	
	@GetMapping("/get-byUsername")
	public User findByUsername(@RequestParam String username) {
		return this.operatorService.findByUsername(username);
	}
	
	

}
