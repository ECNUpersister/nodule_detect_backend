package com.dong.garbage_classification_backend.dao;

import com.dong.garbage_classification_backend.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUsername(String username);
    User getByUsernameAndPassword(String username,String password);
}


