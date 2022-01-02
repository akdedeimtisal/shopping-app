package com.shooping.shoppingapp.product.service;

import com.shooping.shoppingapp.product.domain.Product;
import com.shooping.shoppingapp.product.model.ProductResponse;
import com.shooping.shoppingapp.product.repository.mongo.ProductRepository;
import com.shooping.shoppingapp.repository.es.ProductEsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepository;

    List<ProductResponse> getByPaging(Pageable pageable) {
        //1-ES den sorgular
        //2-calc fieldları işle
        //3-redisten ihtiyaç alanlarını getir
        //4-response nesnesini oluştur
        return null;
    }


    ProductResponse save(ProductSaveRequest productSaveRequest) {
        //1-mongoya yaz
        //2-ES güncelle
        //3-Redis güncelle
        //4-ESden cevap dön
        //5-response nesnesini dönüştür
        return null;
    }


}
