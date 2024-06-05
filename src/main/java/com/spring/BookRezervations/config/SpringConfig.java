package com.spring.BookRezervations.config;

import com.spring.BookRezervations.repository.UserRepository;
import com.spring.BookRezervations.service.UserService;
import com.spring.BookRezervations.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Autowired
    public SpringConfig(UserRepository userRepository) {
    }
    @Bean
    @Qualifier("UserService")
    public UserService getUserService(){
        return new UserServiceImpl();
    }
}
