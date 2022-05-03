package com.sainnt.geekbrains.homework10.controller;

import com.sainnt.geekbrains.homework10.dto.ProductDto;
import com.sainnt.geekbrains.homework10.entity.Product;
import com.sainnt.geekbrains.homework10.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/product")
public class ProductController extends CrudController<Product> {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        super(productService);
        this.productService = productService;
    }

    @PostMapping
    public Product createProduct(@RequestBody ProductDto dto) {
        return productService.saveProduct(dto);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable long id, @RequestBody ProductDto dto) {
        return productService.updateProduct(id, dto);
    }
}
