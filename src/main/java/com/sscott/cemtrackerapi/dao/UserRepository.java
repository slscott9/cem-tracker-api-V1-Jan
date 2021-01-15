package com.sscott.cemtrackerapi.dao;

import com.sscott.cemtrackerapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, String> {

    Optional<User> findByUserName(String name);
}
