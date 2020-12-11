package com.jxs.feign.credit;

import org.springframework.stereotype.Component;

@Component
public class CreditServiceFallback implements CreditService {

    @Override
    public String addCredit(String productId, String creditCount) {
        System.out.println("调用积分服务失败，产品编号" + productId + ",积分数" + creditCount);

        return "调用积分服务失败，产品编号" + productId + ",积分数" + creditCount;
    }
}
