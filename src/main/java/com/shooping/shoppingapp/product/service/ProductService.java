package com.shooping.shoppingapp.product.service;

import com.shooping.shoppingapp.product.domain.MoneyType;
import com.shooping.shoppingapp.product.domain.es.ProductEs;
import com.shooping.shoppingapp.product.model.ProductResponse;
import com.shooping.shoppingapp.product.model.ProductSaveRequest;
import com.shooping.shoppingapp.product.model.ProductSellerResponses;
import com.shooping.shoppingapp.product.repository.mongo.ProductRepository;
import com.shooping.shoppingapp.repository.es.ProductEsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepository;
    private final ProductPriceService productPriceService;
    private final ProductDeliveryService productDeliveryService;
    private final ProductAmountService productAmountService;
    private final ProductImageService productImageService;

    public Flux<ProductResponse> getAll() {
        return productEsRepository.findAll().map( this::mapToDto );
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
    private ProductResponse mapToDto(ProductEs item) {
        BigDecimal productPrice = productPriceService.getByMoneyType(item.getId(), MoneyType.USD);
        return   ProductResponse.builder().price(productPrice)
                .name(item.getName())
                .features(item.getFeatures())
                .id(item.getId())
                .description(item.getDescription())
                .deliveryIn(productDeliveryService.getDeliveryInfo(item.getId()))
                .categoryId(item.getCategory().getId())
                .available(productAmountService.getByProductId(item.getId()))
                .freeDelivery(productDeliveryService.freeDeliveryCheck(item.getId(), productPrice))
                .moneyType(MoneyType.USD)
                .image(productImageService.getProductMainImage(item.getId()))
                .seller(ProductSellerResponses.builder().id(item.getSeller().getId()).name(item.getSeller().getName()).build())
                .build();



    }

}
