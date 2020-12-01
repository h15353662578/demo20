package com.hs.store.service.impl;

import com.hs.store.mapper.StoreMapper;
import com.hs.store.module.pojo.Store;
import com.hs.store.service.StoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 华生
 * 2020/11/9
 */

@Service
public class StoreServiceImpl implements StoreService {

    @Resource
    private StoreMapper storeMapper;

    @Override
    public int addStore(Store store) {
        return storeMapper.addStore(store);
    }

    @Override
    public List<Store> findAll() {
        return storeMapper.findAll();
    }

    @Override
    public List<Store> likeStoreName(String comName) {
        return storeMapper.likeStoreName(comName);
    }

    @Override
    public int deleteStoreById(Long id){
        return storeMapper.deleteStoreById(id);
    }

    @Override
    public int saveStore(Store store){
        return storeMapper.saveStore(store);
    }
}
