package com.shooping.shoppingapp.product.repository.mongo;

import com.shooping.shoppingapp.product.domain.ProductPrice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductPriceRepository extends ReactiveMongoRepository<ProductPrice, String> {
}
