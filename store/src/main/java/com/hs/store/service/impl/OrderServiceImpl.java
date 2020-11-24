package com.hs.store.service.impl;

import com.hs.store.mapper.OrderMapper;
import com.hs.store.module.pojo.Order;
import com.hs.store.module.pojo.OrderUser;
import com.hs.store.module.pojo.User;
import com.hs.store.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 华生
 * 2020/11/12
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public Map<Order, OrderUser> findByOrderId(Long orderId){
        return orderMapper.findByOrderId(orderId);
    }

    @Override
    public List<Map<Order,OrderUser>> findAll(){
        return orderMapper.findAll();
    }

    @Override
    public List<Order> findList(){
        return orderMapper.findList();
    }

    @Override
    public int deleteOrderById(Long orderId){
        return orderMapper.deleteOrderById(orderId);
    }

}
