package com.shooping.shoppingapp.product.model;

import java.math.BigDecimal;

public class ProductResponse {
  /*  String productCode; // name + model/
    //frontendle bağlantıyı sağlamak için ID bilinmesine gerek yok, productCode ile iletişim sağlanacak.
  */

  private String id;
  private String image;
  private String name;
  private String description;
  private ProductSellerResponses seller;
  private String features;
  private int available;
  private boolean freeDelivery;
  private String deliveryIn;
  private BigDecimal price;
  private String categoryId;
  private String moneyType;



}
