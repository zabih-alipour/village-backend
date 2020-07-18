package com.alipour.product.villagesite.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public class ConstantEntity extends ParentEntity {

    public ConstantEntity() {

    }

    public ConstantEntity(Long id) {
        super(id);
    }

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "code", unique = true)
    private String code;

    @Column(name = "is_active")
    private boolean active;
}
