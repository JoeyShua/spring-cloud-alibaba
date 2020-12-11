package com.jxs.order.controller;

import com.jxs.feign.credit.CreditService;
import com.jxs.feign.stock.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private StockService stockService;
    @Resource
    private CreditService creditService;


    @GetMapping("/order/addOrder/{productId}/{stockCount}")
    public String addOrder(@PathVariable("productId") String productId, @PathVariable("stockCount") String stockCount) {

        creditService.addCredit(productId, "10");
        stockService.reduceStock(productId, stockCount);

        return "订单处理成功";
    }
}
