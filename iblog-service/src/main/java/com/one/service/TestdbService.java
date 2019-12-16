package com.one.service;


import com.one.domain.entity.system.UserDetil;
import com.one.dto.UserDetilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

@Service
public class TestdbService {

   /* @Autowired
    private AgentUserRepository agentUserRepository;

    @Autowired
    private ArticleRepository articleRepository;*/

    @Autowired
    private UserDetilRepository userDetilRepository;

    public List<UserDetil> test() {

        // List<AgentUser> all = agentUserRepository.findAll();


        List<UserDetil> all1 = userDetilRepository.findAll();


        return all1;
        // return all;


    }


    public UserDetil test01() {

        // List<AgentUser> all = agentUserRepository.findAll();


        UserDetil user = new UserDetil();

        user.setCreate_date(new Date());

        UserDetil all1 = userDetilRepository.save(user);


        return all1;
        // return all;


    }


}
