package com.lq.student.service.impl;

import com.lq.student.dao.UserDao;
import com.lq.student.entity.User;
import com.lq.student.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByUserName(String username) {
        return userDao.findByUserName(username);
    }

    @Override
    public int add(User user) {
        return userDao.add(user);
    }

    @Override
    public int edit(User user) {
        return userDao.edit(user);
    }

    @Override
    public int delete(String ids) {
        return userDao.delete(ids);
    }

    @Override
    public List<User> findList(Map<String,Object> queryMap) {
        return userDao.findList(queryMap);
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return userDao.getTotal(queryMap);
    }
}
