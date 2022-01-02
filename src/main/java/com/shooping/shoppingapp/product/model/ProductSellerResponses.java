package com.shooping.shoppingapp.product.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductSellerResponses {
    private String id;
    private String name;
}
