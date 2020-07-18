package com.alipour.product.villagesite.models;

import com.alipour.product.villagesite.models.constants.UserStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@Getter
@Setter
public class User extends MutableEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "mobile_number", unique = true)
    private String mobileNumber;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_STATUS_ID", foreignKey = @ForeignKey(name = "fk_status_of_user"))
    private UserStatus userStatus;


}
