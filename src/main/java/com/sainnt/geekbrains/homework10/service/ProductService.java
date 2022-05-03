package com.sainnt.geekbrains.homework10.service;

import com.sainnt.geekbrains.homework10.dto.ProductDto;
import com.sainnt.geekbrains.homework10.entity.Product;

public interface ProductService extends CRUDService<Product> {

    Product saveProduct(ProductDto dto);

    Product updateProduct(long id, ProductDto dto);

}
