package com.alipour.product.villagesite.units;

import com.alipour.product.villagesite.models.User;
import com.alipour.product.villagesite.services.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.fest.assertions.Assertions.assertThat;

public class UserTest extends ParentUnitTest {
    @Autowired
    private UserService userService;


    @Test
    public void add__typical_user__success() {
        String password = "jack";

        User user = new User();
        user.setName("Jack");
        user.setMobileNumber("09387122552");
        user.setPassword(password);
        user.setUsername("jojo");

        user = userService.add(user);
        assertThat(user.getId()).isNotNull();
        assertThat(user.getPassword()).isNotEqualTo(password);
    }
}
