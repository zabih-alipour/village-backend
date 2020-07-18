package com.alipour.product.villagesite.models.constants;

import com.alipour.product.villagesite.models.ConstantEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER_STATUS")
public class UserStatus extends ConstantEntity {
    public static UserStatus ACTIVE = new UserStatus(1L);
    public static UserStatus INACTIVE = new UserStatus(2L);
    public static UserStatus SUSPENDED = new UserStatus(3L);


    public UserStatus() {
    }

    public UserStatus(Long id) {
        super(id);
    }
}
