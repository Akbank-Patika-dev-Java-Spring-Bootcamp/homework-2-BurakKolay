package com.burakkolay.akbankhw2.service.entityservice;

import com.burakkolay.akbankhw2.dao.ProductRepository;
import com.burakkolay.akbankhw2.dto.product.ProductUpdateRequest;
import com.burakkolay.akbankhw2.entity.Product;
import com.burakkolay.akbankhw2.general.BaseEntityService;
import org.springframework.stereotype.Service;

@Service
public class ProductEntityService extends BaseEntityService<Product, ProductRepository> {
    public ProductEntityService(ProductRepository repository){
        super(repository);
    }

    public Product update(Long id, ProductUpdateRequest request){
        Product product = getRepository().findById(id).orElseThrow();
        product.setPrice(request.price());
        getRepository().save(product);
        return product;
    }

}
