package com.hs.store.mapper;

import com.hs.store.module.pojo.Store;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 华生
 * 2020/11/9
 */

@Mapper
public interface StoreMapper {

    /***
     * 查询全部商品
     * @return
     */
    @Select("select * from store")
    public List<Store> findAll();

    /***
     * 模糊查询商品
     * @param comName
     * @return
     */
    @Select("select * from store where com_name like concat('%',#{comName},'%')")
    public List<Store> likeStoreName(String comName);

    /***
     * 添加商品
     * @param store
     * @return
     */
    @Insert("insert into store (com_name, com_price, com_first_char, com_brand, com_class, com_status) values (#{comName},#{comPrice},#{comFirstChar},#{comBrand},#{comClass},#{comStatus})")
    public int addStore(Store store);

    @Delete("delete store from store where id=#{id}")
    public int deleteStoreById(Long id);
}
