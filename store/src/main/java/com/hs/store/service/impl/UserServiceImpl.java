package com.hs.store.service.impl;

import com.hs.store.mapper.UserMapper;
import com.hs.store.module.pojo.User;
import com.hs.store.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 华生
 * 2020/11/9
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User likename(String name){
        return userMapper.likename(name);
    }

    @Override
    public int addUser(User user){
        return userMapper.addUser(user);
    }

    @Override
    public Integer deleteUserByName(String userName){
        return userMapper.deleteUserByName(userName);
    }

    @Override
    public List<User> findByName(String userName){
        return userMapper.findByName(userName);
    }

    @Override
    public Integer save(User user){
        return userMapper.save(user);
    }

    @Override
    public Integer deleteUserById(Long id){
        return userMapper.deleteUserById(id);
    }
}
