package com.example.h2dbtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.h2dbtest.model.Address;
import com.example.h2dbtest.model.User;
import com.example.h2dbtest.service.H2DbTestService;

@RestController("h2dbtest/v1")
public class H2DbTestController {

	@Autowired
	private H2DbTestService dbTestService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return dbTestService.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable Integer id) {
		return dbTestService.getUserById(id);
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return dbTestService.addUser(user);
	}
	
	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable Integer id, @RequestBody User user) {
		return dbTestService.updateUser(id, user);
	}
	
	@PatchMapping("/users/{id}")
	public User patchUser(@PathVariable Integer id, @RequestBody User user) {
		return dbTestService.patchUser(id, user);
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable Integer id) {
		 return dbTestService.deleteUser(id);
	}
	
	
	@GetMapping("/address")
	public List<Address> getAllAddress() {
		return dbTestService.getAllAddress();
	}
	
	@GetMapping("/address/{id}")
	public Address getAddressById(@PathVariable Integer id) {
		return dbTestService.getAddressById(id);
	}
	
	@PostMapping("/address")
	public Address addAddress(@RequestBody Address address) {
		return dbTestService.addAddress(address);
	}
	
	@PutMapping("/address/{id}")
	public Address updateAddress(@PathVariable Integer id, @RequestBody Address address) {
		return dbTestService.updateAddress(id, address);
	}
	
	@PatchMapping("/address/{id}")
	public Address patchAddress(@PathVariable Integer id, @RequestBody Address address) {
		return dbTestService.patchAddress(id, address);
	}
	
	@DeleteMapping("/address/{id}")
	public String deleteAddress(@PathVariable Integer id) {
		 return dbTestService.deleteAddress(id);
	}

}
