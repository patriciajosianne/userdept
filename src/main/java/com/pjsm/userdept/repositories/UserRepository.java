package com.pjsm.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjsm.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
