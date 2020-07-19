package com.alipour.product.villagesite.services;

import com.alipour.product.villagesite.models.User;
import com.alipour.product.villagesite.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl extends ParentServiceImpl<User> implements UserService {

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        super(userRepository);
    }
}
