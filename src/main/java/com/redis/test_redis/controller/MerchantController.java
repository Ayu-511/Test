package com.redis.test_redis.controller;


import com.redis.test_redis.domain.entity.MerchantEntity;
import com.redis.test_redis.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@CrossOrigin
@RequestMapping("/merchant")
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

//    public MerchantController(MerchantService merchantService) {
//        this.merchantService = merchantService;
//    }

//    @RequestMapping("/selectById")
    @GetMapping("/selectById")
    public MerchantEntity selectById(@RequestParam String id){
        return merchantService.selectById(id);
    }
}
