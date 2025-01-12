package com.baiching.repository;

import com.baiching.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//User = from model, Long = data type of the Id
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
