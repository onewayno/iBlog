package com.one.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@ComponentScan(basePackages = {"com.one"})
@EntityScan(value = {"com.one.domain.entity"})
@EnableJpaRepositories("com.one.dto")
@ComponentScan(basePackages = {"com.one.dto"})
public class WebApplication {


    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class);
    }


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }

}
