package com.example.hibernaterelationonetoone.repository;

import com.example.hibernaterelationonetoone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
