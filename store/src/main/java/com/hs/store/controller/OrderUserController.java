package com.hs.store.controller;

import com.hs.store.module.pojo.Order;
import com.hs.store.module.pojo.OrderUser;
import com.hs.store.service.OrderUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 华生
 * 2020/11/18
 */
@RestController
@RequestMapping("/orderUser")
public class OrderUserController {

    @Resource
    private OrderUserService orderUserService;

    @ApiOperation("/查询所有订单用户信息")
    @GetMapping("/findAll")
    public List<OrderUser> findAll(){
        return orderUserService.findAll();
    }

    @ApiOperation("/根据id删除订单用户信息")
    @DeleteMapping("/deleteOrderUserById")
    public int deleteOrderUserById(Long orderId){
        return orderUserService.deleteOrderUserById(orderId);
    }

    @ApiOperation("/添加订单用户信息")
    @PutMapping("/addOrderUser")
    public int addOrderUser(@RequestBody OrderUser orderUser){
        return orderUserService.addOrderUser(orderUser);
    }
}
