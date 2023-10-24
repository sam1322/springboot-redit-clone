package com.breadit.redditClone.dao.postgres.repository;

import com.breadit.redditClone.dao.postgres.model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);
}
