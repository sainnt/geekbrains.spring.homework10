package com.sainnt.geekbrains.homework10.controller;

import com.sainnt.geekbrains.homework10.entity.Entity;
import com.sainnt.geekbrains.homework10.service.CRUDService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public abstract class CrudController<T extends Entity> {
    private final CRUDService<T> crudService;

    public CrudController(CRUDService<T> crudService) {
        this.crudService = crudService;
    }

    @GetMapping
    public List<T> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/{id}")
    public T getById(@PathVariable long id) {
        return crudService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        crudService.deleteById(id);
    }
}
