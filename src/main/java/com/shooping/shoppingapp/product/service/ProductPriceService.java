package com.shooping.shoppingapp.product.service;

import com.shooping.shoppingapp.product.domain.MoneyType;

import java.math.BigDecimal;

public class ProductPriceService {

    public BigDecimal getByMoneyType(String id, MoneyType usd) {
        return BigDecimal.TEN;
    }
}
