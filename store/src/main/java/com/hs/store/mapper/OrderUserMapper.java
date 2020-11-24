package com.hs.store.mapper;

import com.hs.store.module.pojo.OrderUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 华生
 * 2020/11/18
 */

@Mapper
public interface OrderUserMapper {

    @Select("select * from order_user")
    public List<OrderUser> findAll();

    @Delete("delete order_user from order_user where order_id=#{orderId}")
    public int deleteOrderUserById(Long orderId);

    @Insert("insert into order_user (order_id, order_user_name, order_user_username, order_user_phone)\n" +
            "values (#{orderId}, #{orderUserName}, #{orderUserUsername}, #{orderUserPhone})")
    public int addOrderUser(OrderUser orderUser);
}
