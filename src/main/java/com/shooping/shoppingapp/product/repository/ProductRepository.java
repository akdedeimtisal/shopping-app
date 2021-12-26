package com.shooping.shoppingapp.product.repository;

import com.shooping.shoppingapp.product.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
// Bağlı olduğu nesneyi ve o nesnedeki ID'nin tipini yazıyoruz.




}
