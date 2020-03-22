package com.shop.miniso.serice;

import com.shop.miniso.entity.User;

import java.util.List;

public interface IUserSerice {

    public User login(String uAccount,String uLoginPwd);

    public int registeredUser(User user);

    public List<User> findAll();

}
