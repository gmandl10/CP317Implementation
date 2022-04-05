package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User;
import com.UserRepository;

@Service
public class UserService {
@Autowired
UserRepository userRepository;

//getting all user records
public List<User> getAllUser(){
	List<User> users = new ArrayList<User>();
	userRepository.findAll().forEach(user -> users.add(user));
	return users;
}
//getting a specific record
public User getUserById(int id)
{
	return userRepository.findById(id).get();
}
public void saveOrUpdate(User user) {
	userRepository.save(user);
}
//deleting a specific record
public void delete(int id) {
	userRepository.deleteById(id);
}
}



