package com.hs.store.service;

import com.hs.store.module.pojo.Store;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 华生
 * 2020/11/9
 */

@Service
public interface StoreService {

    public int addStore(Store store);

    public List<Store> findAll();

    public List<Store> likeStoreName(String comName);

    public int deleteUserById(Long id);
}
