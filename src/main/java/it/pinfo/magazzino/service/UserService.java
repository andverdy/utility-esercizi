package it.pinfo.magazzino.service;

import it.pinfo.magazzino.entity.User;

public interface UserService {
	
	public User findByUsername(String username);

}
