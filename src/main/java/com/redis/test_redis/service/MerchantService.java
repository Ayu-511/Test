package com.redis.test_redis.service;

import com.redis.test_redis.domain.entity.MerchantEntity;

public interface MerchantService {

    MerchantEntity selectById(String id);
}
