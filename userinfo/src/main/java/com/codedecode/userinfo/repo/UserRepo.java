package com.codedecode.userinfo.repo;

import com.codedecode.userinfo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
