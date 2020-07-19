package com.alipour.product.villagesite.listeners;


import com.alipour.product.villagesite.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.PrePersist;

public class UserEntityListener {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PrePersist
    public void prePersist(Object o) {
        if (o instanceof User) {
            ((User) o).setPassword(passwordEncoder.encode(((User) o).getPassword()));

        }
    }
}
