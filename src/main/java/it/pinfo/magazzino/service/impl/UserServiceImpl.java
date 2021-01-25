package it.pinfo.magazzino.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pinfo.magazzino.entity.User;
import it.pinfo.magazzino.repository.UserRepository;
import it.pinfo.magazzino.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByUsername(String username) {
		return this.userRepository.findByUsername(username);
	}
}
