package com.spring.RestaurantReservations.config;

import com.spring.RestaurantReservations.repository.UserRepository;
import com.spring.RestaurantReservations.service.UserDetailsServiceImpl;
import com.spring.RestaurantReservations.service.UserService;
import com.spring.RestaurantReservations.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class SpringConfig {

    @Autowired
    public SpringConfig(UserRepository userRepository) {
    }

    @Bean
    @Qualifier("UserDetailsService")
    public UserDetailsService getuserDetailsService() {
        return new UserDetailsServiceImpl();
    }

    @Bean
    @Qualifier("UserService")
    public UserService getUserService(){
        return new UserServiceImpl();
    }
}
