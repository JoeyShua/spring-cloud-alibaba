package com.jxs.feign.credit;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "credit-service", fallback = CreditServiceFallback.class)
public interface CreditService {

    @GetMapping(value = "/credit/addCredit/{productId}/{creditCount}")
    public String addCredit(@PathVariable("productId") String productId, @PathVariable("creditCount") String creditCount);
}
