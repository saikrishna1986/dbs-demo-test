package com.dbs.dbsdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "User")
@Data
public class User {
    @Id
    private Integer id;
    private String name;
    private String password;


}
