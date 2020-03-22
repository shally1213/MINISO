package com.shop.miniso.dao;

import com.shop.miniso.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    public User login(String uAccount,String uLoginPwd);

    public List<User> findAll();

}
