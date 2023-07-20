package com.example.springdtosample.repository;

import com.example.springdtosample.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
}
