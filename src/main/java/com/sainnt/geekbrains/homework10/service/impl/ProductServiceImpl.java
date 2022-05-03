package com.sainnt.geekbrains.homework10.service.impl;

import com.sainnt.geekbrains.homework10.dto.ProductDto;
import com.sainnt.geekbrains.homework10.entity.Product;
import com.sainnt.geekbrains.homework10.repository.ProductRepository;
import com.sainnt.geekbrains.homework10.service.CRUDServiceImpl;
import com.sainnt.geekbrains.homework10.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends CRUDServiceImpl<Product> implements ProductService {

    public ProductServiceImpl(ProductRepository productRepository) {
        super(productRepository);
    }

    @Override
    public Product saveProduct(ProductDto dto) {
        return repository.save(mapToEntity(dto));
    }

    @Override
    public Product updateProduct(long id, ProductDto dto) {
        Product entity = mapToEntity(dto);
        entity.setId(id);
        return repository.save(entity);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    private Product mapToEntity(ProductDto dto) {
        return new Product(dto.getName(), dto.getPrice());
    }
}
