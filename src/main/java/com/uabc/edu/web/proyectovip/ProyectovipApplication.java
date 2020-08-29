package com.uabc.edu.web.proyectovip;

import com.uabc.edu.web.proyectovip.service.security.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;


@SpringBootApplication
@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class ProyectovipApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProyectovipApplication.class, args);
    }



}
