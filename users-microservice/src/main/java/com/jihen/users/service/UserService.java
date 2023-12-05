package com.jihen.users.service;

import com.jihen.users.entities.Role;
import com.jihen.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);

}
