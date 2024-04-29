package com.example.h2dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.h2dbtest.model.User;

@Repository
public interface H2DbTestUserRepository  extends JpaRepository<User, Integer>{

}
