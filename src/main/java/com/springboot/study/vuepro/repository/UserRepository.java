package com.springboot.study.vuepro.repository;

import com.springboot.study.vuepro.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
