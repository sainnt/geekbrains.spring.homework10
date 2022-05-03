package com.sainnt.geekbrains.homework10.service;


import com.sainnt.geekbrains.homework10.entity.Entity;

import java.util.List;

public interface CRUDService<T extends Entity> {
    List<T> getAll();

    T getById(long id);

    void deleteById(long id);
}
