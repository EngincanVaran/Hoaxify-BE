package com.example.hoaxify.Hoaxify.user;

import org.springframework.stereotype.Service;

/**
 * @author engincanvaran
 * @project Hoaxify
 * @date 10.06.2021 13:53
 */
@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    public User save(User user){
        return userRepository.save(user);
    }

}
