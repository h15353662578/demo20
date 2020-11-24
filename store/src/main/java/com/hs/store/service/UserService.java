package com.hs.store.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hs.store.mapper.UserMapper;
import com.hs.store.module.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author 华生
 * 2020/11/9
 */
@Service
public interface UserService  {

    public List<User> findByName(String userName);

    public List<User> findAll();

    public User likename(String name);

    public int addUser(User user);

    public int deleteUserByName(String userName);

    public int save(User user);

    public int deleteUserById(Long id);
}
