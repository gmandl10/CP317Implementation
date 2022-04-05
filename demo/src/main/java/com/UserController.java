package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.User;
import com.UserService;



@RestController
public class UserController {

@Autowired
UserService userservice;

@GetMapping("/User")
private List<User> getAllUser()
{
	return userservice.getAllUser();
}
@GetMapping("/User/{id}")
private User getUser(@PathVariable("id")int id) {
	return userservice.getUserById(id);
}
@DeleteMapping("/User/{id}")
private void deleteUser(@PathVariable("id") int id) {
	userservice.delete(id);
}

@PostMapping("/User")
private int saveUser(@RequestBody User user) {
	userservice.saveOrUpdate(user);
	return user.getId();
}

}
