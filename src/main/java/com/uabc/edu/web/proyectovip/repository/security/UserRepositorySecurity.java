package com.uabc.edu.web.proyectovip.repository.security;

import com.uabc.edu.web.proyectovip.model.security.UserSecurity;
import org.springframework.data.repository.CrudRepository;


public interface UserRepositorySecurity extends CrudRepository<UserSecurity, Long> {
    UserSecurity findByName(String username);

}
