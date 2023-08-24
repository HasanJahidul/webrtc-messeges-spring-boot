package com.arits.messages.entity;

import com.arits.messages.views.Views;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonView({Views.Public.class, Views.Summary.class})
    private Long id;


    @Column(name = "created_at")
    @JsonView({Views.Private.class, Views.Summary.class, Views.Public.class})
    private LocalDateTime createdAt;


    @Column(name = "updated_at")
    @JsonView({Views.Private.class, Views.Summary.class, Views.Public.class})
    private LocalDateTime updatedAt;


    @Column(name = "created_by")
    @JsonView(Views.Private.class)
    private String createdBy;


    @Column(name = "updated_by")
    @JsonView(Views.Private.class)
    private String updatedBy;

    @Column(name = "is_deleted")
    @JsonView(Views.Private.class)
    private Boolean isDeleted;
    
}
