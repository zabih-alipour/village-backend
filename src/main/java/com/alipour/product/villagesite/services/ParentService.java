package com.alipour.product.villagesite.services;

import com.alipour.product.villagesite.models.ParentEntity;

import java.util.List;

public interface ParentService<T extends ParentEntity> {
    T get(Long id);

    T add(T t);

    T edit(T t);

    T delete(Long id);

    default T delete(T t) {
        return delete(t.getId());
    }

    List<T> listAll();
}
