package com.demo.example.demoTest.configs;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeFilterFunctions;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfigs {

    @Bean
    public WebClient createWebClient(){
//        Main api link with some authentications
        return WebClient.builder()
//                .baseUrl("https://sandbox-authservice.priaid.ch/")
                .baseUrl("https://sandbox-healthservice.priaid.ch/")
//                .filter(ExchangeFilterFunctions.basicAuthentication("gabriel.mbatha@gmail.com","Td97MmQy8i3FWp4f6 "))
                .build();
    }
}
