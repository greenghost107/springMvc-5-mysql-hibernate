package com.mysql.mk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysql.mk.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
}
