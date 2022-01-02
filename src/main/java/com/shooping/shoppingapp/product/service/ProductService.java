package com.shooping.shoppingapp.product.service;

import com.shooping.shoppingapp.product.domain.es.ProductEs;
import com.shooping.shoppingapp.product.model.ProductResponse;
import com.shooping.shoppingapp.product.model.ProductSaveRequest;
import com.shooping.shoppingapp.product.repository.mongo.ProductRepository;
import com.shooping.shoppingapp.repository.es.ProductEsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepository;
    private final ProductPriceService productPriceService;

    public Flux<ProductResponse> getAll() {
        return productEsRepository.findAll().map( this::mapToDto );



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
    /*

     //1-ES den sorgular
        //2-calc fieldları işle
        //3-redisten ihtiyaç alanlarını getir
        //4-response nesnesini oluştur


     */
    private ProductResponse mapToDto(ProductEs productEs) {
        ProductResponse.builder()
                .price()

    }

}
