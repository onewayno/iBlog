package com.one.service;


import com.one.domain.entity.AgentUser;
import com.one.domain.entity.Article;
import com.one.dto.AgentUserRepository;
import com.one.dto.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

@Service
public class TestdbService {

    @Autowired
    private AgentUserRepository agentUserRepository;

    @Autowired
    private ArticleRepository articleRepository;

    public List<AgentUser> test() {

        // List<AgentUser> all = agentUserRepository.findAll();


        List<Article> all1 = articleRepository.findAll();


        return Arrays.asList(new AgentUser());
        // return all;


    }


}
