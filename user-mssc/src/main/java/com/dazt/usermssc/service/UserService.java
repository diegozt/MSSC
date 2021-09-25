package com.dazt.usermssc.service;

import com.dazt.usermssc.entity.User;
import com.dazt.usermssc.repository.UserRepository;
import com.dazt.usermssc.to.DepartmentTO;
import com.dazt.usermssc.to.ResponseTemplateTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser in UserService");
        return repository.save(user);
    }

    public ResponseTemplateTO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment in UserService");
        ResponseTemplateTO response = new ResponseTemplateTO();
        User user = repository.findByUserId(userId);
        response.setUser(user);

        DepartmentTO department = restTemplate.getForObject("http://DEPARTMENT-MSSC/departments/" + userId.toString(),
                DepartmentTO.class);
        response.setDepartmentTO(department);
        return response;
    }
}