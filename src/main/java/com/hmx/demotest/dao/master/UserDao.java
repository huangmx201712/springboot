package com.hmx.demotest.dao.master;

import com.hmx.demotest.entity.User;

import java.util.List;
import java.util.Map;


public interface UserDao {
    List<User> findUser(Map<String,String> map);
   // User findUserTo(User user);
}
