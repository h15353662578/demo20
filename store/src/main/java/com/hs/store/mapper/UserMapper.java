package com.hs.store.mapper;

import com.hs.store.module.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 华生
 * 2020/11/9
 */


@Mapper
public interface UserMapper {

    /***
     * 查询全部用户
     * @return
     */
    @Select("select * from user")
    public List<User> findAll();

    /***
     * 模糊查询用户
     * @param name
     * @return
     */
    @Select("select * from user where name like concat('%',#{name},'%');")
    public User likename(String name);

    /***
     * 添加用户
     * @param user
     * @return
     */
    @Insert("insert into user (id,name, user_name, password, user_sex, user_age,user_phone, order_id) values (#{id},#{name},#{userName},#{password},#{userSex},#{userAge},#{userPhone},#{orderId})")
    public int addUser(User user);

    /***
     * 根据账号删除
     * @param userName
     * @return
     */
    @Delete("delete user from user where user_name=#{userName}")
    public int deleteUserByName(String userName);

    /***
     * 根据账号查询用户信息
     * @param userName
     * @return
     */
    @Select("select * from user where user_name=#{userName}")
    public List<User> findByName(String userName);

    /***
     * 根据ID更新用户信息
     * @param user
     * @return
     */
    @Update("update user SET id = # {id}, name = #{name}, user_phone = #{userPhone}, user_name = #{userName},\n" +
            "\t\tpassword = #{password}, user_sex = #{userSex}, order_id = #{userId}, user_age = #{userAge}\n" +
            "\t\twhere id = #{id}")
    public int save(User user);

    @Delete("delete user from user where id=#{id}")
    public int deleteUserById(Long id);
}
