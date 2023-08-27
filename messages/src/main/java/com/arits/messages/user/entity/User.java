package com.arits.messages.user.entity;

import com.arits.messages.entity.BaseEntity;
import com.arits.messages.views.Views;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.annotations.Where;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Document(collection = "users")
@Where(clause = "is_deleted = false OR is_deleted is null")
public class User extends BaseEntity {
    @JsonView({Views.Public.class, Views.Summary.class, Views.Internal.class})

    private String email;
    @JsonView({Views.Public.class, Views.Summary.class, Views.Internal.class})

    private String username;
    @JsonView({Views.Public.class, Views.Summary.class, Views.Internal.class})

    private String password;
    @JsonView({Views.Public.class, Views.Summary.class, Views.Internal.class})

    private String name;
    @JsonView({Views.Public.class, Views.Summary.class, Views.Internal.class})

    private String phone;
    @JsonView({Views.Public.class, Views.Summary.class, Views.Internal.class})

    private String address;
    @JsonView({Views.Public.class, Views.Summary.class, Views.Internal.class})

    private String role;

    @JsonIgnore
    @Field(name = "token")
    private String token;



}
