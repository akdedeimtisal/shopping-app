package com.shooping.shoppingapp.product.repository.mongo;

import com.shooping.shoppingapp.product.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
// Bağlı olduğu nesneyi ve o nesnedeki ID'nin tipini yazıyoruz.




}
