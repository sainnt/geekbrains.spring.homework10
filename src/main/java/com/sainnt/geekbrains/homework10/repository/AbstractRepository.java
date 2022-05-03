package com.sainnt.geekbrains.homework10.repository;

import com.sainnt.geekbrains.homework10.entity.Entity;
import com.sainnt.geekbrains.homework10.exception.ResourceNotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public abstract class AbstractRepository<T extends Entity> {
    private final AtomicLong idCounter = new AtomicLong(1);

    protected Map<Long, T> entities;

    public AbstractRepository() {
        entities = new HashMap<>();
    }

    public T getById(Long id) {
        return entities.get(id);
    }

    public void deleteById(Long id) {
        entities.remove(id);
    }

    public List<T> findAll() {
        return entities.values().stream().toList();
    }

    public T save(T entity) {
        if (entity.getId() == null) {
            entity.setId(idCounter.getAndIncrement());
        } else if (!entities.containsKey(entity.getId()))
            throw new ResourceNotFoundException(String.format(" #%d not found", entity.getId()));
        entities.put(entity.getId(), entity);
        return entity;
    }

    protected abstract String getEntityName();
}
