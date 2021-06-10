package com.example.hoaxify.Hoaxify.user;

import com.example.hoaxify.Hoaxify.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author engincanvaran
 * @project Hoaxify
 * @date 10.06.2021 13:09
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("api/1.0/users")
    GenericResponse createUser(@RequestBody User user) {
        userService.save(user);
        return new GenericResponse("User Saved");
    }

}
