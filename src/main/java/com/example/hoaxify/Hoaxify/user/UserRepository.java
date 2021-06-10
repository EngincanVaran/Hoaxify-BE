package com.example.hoaxify.Hoaxify.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author engincanvaran
 * @project Hoaxify
 * @date 10.06.2021 13:21
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
