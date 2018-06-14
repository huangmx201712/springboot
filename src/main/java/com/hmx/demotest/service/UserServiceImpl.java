package com.hmx.demotest.service;

import com.hmx.demotest.dao.master.UserDao;
import com.hmx.demotest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
   public UserDao userDao;

    @Override
    public Boolean doLogin(String account, String password) {
        Map<String,String> map=new HashMap<>();
        map.put("account",account);
        map.put("password",password);
        User user =new User();
        user.setLoginAcct(account);
        user.setPassword(password);
       List<User> list= userDao.findUser(map);
        return true;
    }
}
