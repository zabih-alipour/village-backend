package com.alipour.product.villagesite.services;

import com.alipour.product.villagesite.models.ParentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class ParentServiceImpl<T extends ParentEntity> implements ParentService<T> {
    protected JpaRepository<T, Long> repository;

    public ParentServiceImpl(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    @Override
    public T get(Long id) {
        return repository.getOne(id);
    }

    @Override
    public T add(T t) {
        return repository.save(t);
    }

    @Override
    public T edit(T t) {
        return repository.save(t);
    }

    @Override
    public T delete(Long id) {
        T t = repository.getOne(id);
        repository.deleteById(id);
        return t;
    }

    @Override
    public List<T> listAll() {
        return repository.findAll();
    }
}
