package it.pinfo.magazzino.service.impl;

import java.util.List;

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

	@Override
	public Boolean roleIsAuth(String username) {
		Boolean authRole = true;
		List<String> roles = userRepository.findRolesByUsername(username);
		for (String role : roles) {
			if (role.equals("USER") && roles.size() == 1) {
				authRole = false;
			}
		}
		return authRole;
	}

	@Override
	public User saveRole(Integer id) {
		userRepository.saveRole(id);
		User user = userRepository.findById(id).get();
		return user;
	}

}
