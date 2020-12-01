package com.hs.store.service.impl;

import com.hs.store.mapper.OrderUserMapper;
import com.hs.store.module.pojo.Order;
import com.hs.store.module.pojo.OrderUser;
import com.hs.store.service.OrderUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 华生
 * 2020/11/18
 */
@Service
public class OrderUserServiceImpl implements OrderUserService {

    @Resource
    private OrderUserMapper orderUserMapper;

    @Override
    public List<OrderUser> findAll(){
        return orderUserMapper.findAll();
    }

    @Override
    public int deleteOrderUserById(Long orderId){
        return orderUserMapper.deleteOrderUserById(orderId);
    }

    @Override
    public int addOrderUser(OrderUser orderUser){
        return orderUserMapper.addOrderUser(orderUser);
    }


}
