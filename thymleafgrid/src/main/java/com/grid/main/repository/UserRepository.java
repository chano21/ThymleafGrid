package com.grid.main.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grid.main.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
