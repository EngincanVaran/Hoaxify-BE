package com.example.hoaxify.Hoaxify.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author engincanvaran
 * @project Hoaxify
 * @date 10.06.2021 13:03
 */
@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    private String displayName;

    private String password;
}
