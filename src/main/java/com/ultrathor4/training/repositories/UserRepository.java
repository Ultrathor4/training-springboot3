package com.ultrathor4.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ultrathor4.training.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
