package com.hs.store.mapper;

import com.hs.store.module.pojo.Order;
import com.hs.store.module.pojo.OrderUser;
import com.hs.store.module.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author 华生
 * 2020/11/12
 */

@Mapper
public interface OrderMapper {

    /***
     * 根据orderID查询订单
     * @param orderId
     * @return
     */
    @Select("Select * from `order` inner join order_user where `order`.order_id=#{orderId} and `order`.order_id = order_user.order_id")
    public Map<Order, OrderUser> findByOrderId(Long orderId);

    @Select("Select * from `order` inner join order_user on `order`.order_id = order_user.order_id")
    public List<Map<Order, OrderUser>> findAll();

    @Select("select * from `order`")
    public List<Order> findList();

    @Delete("delete from `order` where order_id=#{orderId}")
    public int deleteOrderById(Long orderId);

}
