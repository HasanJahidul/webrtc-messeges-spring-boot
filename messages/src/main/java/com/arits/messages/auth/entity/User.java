package com.arits.messages.auth.entity;

import com.arits.messages.entity.BaseEntity;
import com.arits.messages.views.Views;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.Column;
import lombok.Getter;

@Getter
public class User extends BaseEntity {
    @Column(name= "email")
    @JsonView({Views.Public.class, Views.Summary.class, Views.Internal.class})
    private String email;


    @Getter
    @JsonIgnore
    @Column(name= "password")
    private String password;

    @Column(name= "is_active")
    @JsonView({Views.Public.class, Views.Internal.class})
    private Boolean isActive;

    @Getter
    @Column(name="token")
    @JsonIgnore
    private String token;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User() {
    }

    public User(String email, String password, Boolean isActive) {
        this.email = email;
        this.password = password;
        this.isActive = isActive;
    }

}
