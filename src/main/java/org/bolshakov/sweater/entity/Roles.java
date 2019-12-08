package org.bolshakov.sweater.entity;

import org.springframework.security.core.GrantedAuthority;

public enum Roles  implements GrantedAuthority {
    User, ADMIN, USER;

    @Override
    public String getAuthority() {
        return name();
    }
}
