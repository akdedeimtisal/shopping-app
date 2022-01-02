package com.shooping.shoppingapp.product.domain.es;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ProductEs {
    //elasticsearch'teki productı gösterecek.
    private String id;
    private String name;
    private boolean active;
    private String code;
    private String description;
    private CompanyEs seller; // 1) satıcı adıyla ürün aramak için. 2) arayüzde seller ismi göstermek için db'ye gidip id ile isim aramak yerine direkt ismini basmak için
    private String features;
    private CategoryEs category;
}
