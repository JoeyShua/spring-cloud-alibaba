package com.jxs.feign.stock;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "stock-service")
public interface StockService {

    @GetMapping(value = "/stock/reduce/{productId}/{stockCount}")
    public String reduceStock(@PathVariable("productId") String productId, @PathVariable("stockCount") String stockCount);
}
