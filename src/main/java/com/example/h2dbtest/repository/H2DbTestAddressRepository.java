package com.example.h2dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.h2dbtest.model.Address;

@Repository
public interface H2DbTestAddressRepository extends JpaRepository<Address, Integer>{

}
