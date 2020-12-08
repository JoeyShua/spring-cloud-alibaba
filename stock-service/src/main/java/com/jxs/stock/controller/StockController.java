package com.jxs.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @GetMapping(value = "/stock/reduce/{productId}/{stockCount}")
    public String reduceStock(@PathVariable("productId") String productId, @PathVariable("stockCount") String stockCount) {
        System.out.println("产品" + productId + ",减库存" + stockCount);
        return "产品" + productId + ",减库存" + stockCount;
    }

}
