package it.pinfo.magazzino.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import it.pinfo.magazzino.entity.User;
import it.pinfo.magazzino.entity.Roles;
import it.pinfo.magazzino.repository.UserRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Collection<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();

		// authorities.add(new SimpleGrantedAuthority(roleName));

		User user = userRepository.findByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("Operator not found with username: " + username);
		}
		for (Roles role : user.getRoles()) {
			roles.add(new SimpleGrantedAuthority(role.getDescrizione()));
		}

		// roles = operator.getRoles();
		
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				roles);

	}

	public User save(User user) {
		User newUser = new User();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setRoles(user.getRoles());
		return userRepository.save(newUser);
	}

}
