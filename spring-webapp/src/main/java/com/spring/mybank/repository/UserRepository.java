package com.spring.mybank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.mybank.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
