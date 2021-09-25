package com.dazt.usermssc.controller;

import com.dazt.usermssc.entity.User;
import com.dazt.usermssc.service.UserService;
import com.dazt.usermssc.to.ResponseTemplateTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/")
    public @ResponseBody User saveUser(@RequestBody User user) {
        log.info("Inside saveUser in UserController");
        return service.saveUser(user);
    }

    @GetMapping("/{id}")
    public @ResponseBody ResponseTemplateTO getUserWithDepartment(@PathVariable Long id) {
        log.info("Inside getUserWithDepartment in UserController");
        return service.getUserWithDepartment(id);
    }
}
