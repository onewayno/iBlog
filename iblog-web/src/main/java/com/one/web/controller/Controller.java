package com.one.web.controller;


import com.one.domain.entity.AgentUser;


import com.one.service.TestdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/con")
public class Controller {
    @Autowired
    private TestdbService testdb;

    @GetMapping("/abc")
    public List<AgentUser> abc() {
        return testdb.test();
    }

}
