package com.shooping.shoppingapp.product.domain;

public class ProductImage {
    private ImageType imageType;
    private String url;

    enum ImageType {
        FEATURE, NORMAL;
    }
}
