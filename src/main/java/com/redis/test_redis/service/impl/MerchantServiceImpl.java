package com.redis.test_redis.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.redis.test_redis.domain.entity.MerchantEntity;
import com.redis.test_redis.mapper.merchant.MerchantMapper;
import com.redis.test_redis.service.MerchantService;
import jdk.nashorn.api.scripting.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    private MerchantMapper merchantMapper;

//    public MerchantServiceImpl(MerchantMapper merchantMapper) {
//        this.merchantMapper = merchantMapper;
//    }

    @Override
    public MerchantEntity selectById(String id) {
        MerchantEntity merchant = merchantMapper.selectByMerchantId(id);
//        System.out.printf(JSONObject.toJSONString(merchant));
        return merchant;
    }
}
