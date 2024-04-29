package com.example.h2dbtest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.h2dbtest.model.Address;
import com.example.h2dbtest.model.User;
import com.example.h2dbtest.repository.H2DbTestAddressRepository;
import com.example.h2dbtest.repository.H2DbTestUserRepository;

@Service
public class H2DbTestService {

	@Autowired
	private H2DbTestUserRepository dbTestUserRepository;

	@Autowired
	private H2DbTestAddressRepository h2DbTestAddressRepository;

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return dbTestUserRepository.findAll();
	}

	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		Optional<User> user = dbTestUserRepository.findById(id);
		if (user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return dbTestUserRepository.save(user);
	}

	public User updateUser(Integer id, User user) {
		// TODO Auto-generated method stub
		return dbTestUserRepository.save(user);
	}

	public User patchUser(Integer id, User user) {
		// TODO Auto-generated method stub
		return dbTestUserRepository.save(user);
	}

	public String deleteUser(Integer id) {
		// TODO Auto-generated method stub
		dbTestUserRepository.deleteById(id);
		return "User deleted!";

	}

	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return h2DbTestAddressRepository.findAll();
	}

	public Address getAddressById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Address> address = h2DbTestAddressRepository.findById(id);
		if (address.isPresent()) {
			return address.get();
		} else {
			return null;
		}
	}

	public Address addAddress(Address address) {
		// TODO Auto-generated method stub
		return h2DbTestAddressRepository.save(address);
	}

	public Address updateAddress(Integer id, Address address) {
		// TODO Auto-generated method stub
		return h2DbTestAddressRepository.save(address);
	}

	public Address patchAddress(Integer id, Address address) {
		// TODO Auto-generated method stub
		return h2DbTestAddressRepository.save(address);
	}

	public String deleteAddress(Integer id) {
		// TODO Auto-generated method stub
		h2DbTestAddressRepository.deleteById(id);
		return "Address deleted!";
	}

}
