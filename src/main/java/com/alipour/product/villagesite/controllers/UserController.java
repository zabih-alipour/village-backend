package com.alipour.product.villagesite.controllers;

import com.alipour.product.villagesite.models.User;
import com.alipour.product.villagesite.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends ParentController<User> {

    @Autowired
    public UserController(UserService service) {
        super(service);
    }
}
