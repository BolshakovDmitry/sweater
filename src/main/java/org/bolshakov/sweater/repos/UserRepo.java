package org.bolshakov.sweater.repos;

import org.bolshakov.sweater.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
