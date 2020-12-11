package com.jxs.credit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XingShuaiJiang
 * 积分服务
 */
@RestController
public class CreditController {

    @GetMapping(value = "/credit/addCredit/{productId}/{creditCount}")
    public String addCredit(@PathVariable("productId") String productId, @PathVariable("creditCount") String creditCount) {
        System.out.println("产品" + productId + ",添加积分" + creditCount);
        return "产品" + productId + ",添加积分" + creditCount;
    }

}
