package com.kunal.schedule.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    @JsonIgnore
    private String password;

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private USER_ROLE role;

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private USER_STATUS status;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;    // TODO
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.status.equals(USER_STATUS.ACTIVE);
    }

    public enum USER_ROLE {
        ANONYMOUS,
        ADMIN,
        MODERATOR,
        CONSUMER
    }

    public enum USER_STATUS {
        ACTIVE,
        INACTIVE
    }
}

