package com.uabc.edu.web.proyectovip;

import com.uabc.edu.web.proyectovip.model.security.UserSecurity;
import com.uabc.edu.web.proyectovip.repository.security.UserRepositorySecurity;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest
class ProyectovipApplicationTests {
/*
    @Autowired
    private UserRepositorySecurity repo;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Test
    void crearUsuarioTest() {
        UserSecurity us = new UserSecurity();
        us.setId((long) 2);
        us.setName("Manuel");
        us.setPassword(encoder.encode("123"));
        repo.save(us);

    }
*/


}
