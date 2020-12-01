package com.hs.store.service;

import com.hs.store.module.pojo.Order;
import com.hs.store.module.pojo.OrderUser;
import com.hs.store.module.pojo.User;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 华生
 * 2020/11/12
 */

@Service
public interface OrderService {

    /***
     * 根据orderID查询订单
     * @param orderId
     * @return
     */
    Map<Order, OrderUser> findByOrderId(Long orderId);

    /***
     * 查询订单与用户信息
     * @return
     */
    List<Map<Order, OrderUser>> findAll();

    /***
     * 查询所有订单
     * @return
     */
    List<Order>findList();

    /***
     * 查询订单信息
     */
    public int deleteOrderById(Long orderId);

    /***
     * 添加订单
     */
    public int addOrder(Order order);

    public int save(Order order);
}
