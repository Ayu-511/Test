package com.redis.test_redis.mapper.merchant;

import com.redis.test_redis.domain.entity.MerchantEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MerchantMapper {
    MerchantEntity selectByMerchantId(String id);
}
