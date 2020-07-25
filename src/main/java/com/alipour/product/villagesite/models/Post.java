package com.alipour.product.villagesite.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "POST")
public class Post extends MutableEntity {

}
