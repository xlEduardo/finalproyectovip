package com.uabc.edu.web.proyectovip.service.security;

import com.uabc.edu.web.proyectovip.model.security.UserSecurity;

public interface UserService {
    void save(UserSecurity userSecurity);

    UserSecurity findByUsername(String username);
}
