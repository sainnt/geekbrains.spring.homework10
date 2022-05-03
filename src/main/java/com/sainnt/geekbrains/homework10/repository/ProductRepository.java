package com.sainnt.geekbrains.homework10.repository;

import com.sainnt.geekbrains.homework10.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;


@Repository
public class ProductRepository extends AbstractRepository<Product> {
    public ProductRepository() {
        initialData();
    }


    @Override
    protected String getEntityName() {
        return "Product";
    }

    private void initialData() {
        Stream.of(
                new Product("Kvas", 20L),
                new Product( "Baikal", 30L),
                new Product( "LeMat revolver", 100L)
        ).forEach(this::save);
    }
}
