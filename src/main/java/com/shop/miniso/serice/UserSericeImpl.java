package com.shop.miniso.serice;

import com.shop.miniso.dao.UserDao;
import com.shop.miniso.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSericeImpl implements IUserSerice{

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String uAccount, String uLoginPwd) {
        return userDao.login(uAccount,uLoginPwd);
    }

    @Override
    public int registeredUser(User user) {
        return 0;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
