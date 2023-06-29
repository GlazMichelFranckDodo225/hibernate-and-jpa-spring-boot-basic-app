package com.dgmf.hibernateandjpaspringbootbasicapp.repository;

import com.dgmf.hibernateandjpaspringbootbasicapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
