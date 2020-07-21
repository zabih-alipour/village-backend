package com.alipour.product.villagesite.controllers;

import com.alipour.product.villagesite.models.ParentEntity;
import com.alipour.product.villagesite.services.ParentService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class ParentController<T extends ParentEntity> {

    private ParentService<T> service;

    public ParentController(ParentService<T> service) {
        this.service = service;
    }

    @PostMapping
    public T add(T t) {
        return service.add(t);
    }

    @PutMapping
    public T edit(T t) {
        return service.add(t);
    }

    @DeleteMapping("/:id")
    public T delete(Long id) {
        return service.delete(id);
    }

    @GetMapping
    public List<T> find(){
        return service.listAll();
    }

    @GetMapping("/:id")
    public T findById(Long id){
        return service.get(id);
    }
}
