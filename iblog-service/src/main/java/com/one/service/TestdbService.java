package com.one.service;


import com.one.domain.entity.AgentUser;
import com.one.dto.AgentUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class TestdbService {

    @Autowired
    private AgentUserRepository agentUserRepository;

    public List<AgentUser> test() {

        List<AgentUser> all = agentUserRepository.findAll();
        //  return Arrays.asList(new AgentUser());
        return all;


    }


}
