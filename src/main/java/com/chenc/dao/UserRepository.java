package com.chenc.dao;

import com.chenc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Chenc
 * @Date 2020/11/25
 * @Description AUTO
 * @Version 1.0
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username,String password);
}
