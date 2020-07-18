package com.alipour.product.villagesite.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Getter
@Setter
public class ParentEntity implements Serializable, Cloneable {
    @Id
    @GeneratedValue
    private Long id;

    public ParentEntity() {

    }

    public ParentEntity(Long id) {
        this.id = id;
    }

}
