package com.sainnt.geekbrains.homework10.controller;

import com.sainnt.geekbrains.homework10.entity.User;
import com.sainnt.geekbrains.homework10.service.CRUDService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController extends CrudController<User>{

    public UserController(CRUDService<User> crudService) {
        super(crudService);
    }
}
