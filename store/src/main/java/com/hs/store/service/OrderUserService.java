package com.hs.store.service;

import com.hs.store.module.pojo.OrderUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 华生
 * 2020/11/18
 */

@Service
public interface OrderUserService {

    List<OrderUser> findAll();

    public int deleteOrderUserById(Long orderId);

    public int addOrderUser(OrderUser orderUser);
}
