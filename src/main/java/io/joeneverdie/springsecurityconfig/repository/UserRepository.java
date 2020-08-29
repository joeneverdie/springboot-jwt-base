package io.joeneverdie.springsecurityconfig.repository;

import io.joeneverdie.springsecurityconfig.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);

    @Query("FROM User u WHERE u.active = true")
    List<User> getAllByActive();
}
