package com.authcontrol.taskguard.repository;

import com.authcontrol.taskguard.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
