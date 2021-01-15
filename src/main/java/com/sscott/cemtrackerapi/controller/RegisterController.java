package com.sscott.cemtrackerapi.controller;

import com.sscott.cemtrackerapi.dao.UserRepository;
import com.sscott.cemtrackerapi.dto.UserDto;
import com.sscott.cemtrackerapi.dto.response.ServerResponse;
import com.sscott.cemtrackerapi.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //  /api/v1/ puts / automatically
public class RegisterController {

    @Autowired
    UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public  RegisterController(PasswordEncoder passwordEncoder){
        this.passwordEncoder = passwordEncoder;
    }

    //ResponseEntity represents the whole Http response, status code, headers , body

    @PostMapping("/v1/register")
    public ResponseEntity<UserDto> register(@RequestBody UserDto userDto){
        User user = new User(
                userDto.getEmail(),
                userDto.getUserName(),
                passwordEncoder.encode(userDto.getPassword()),
                true,
                "USER",
                0,
                0
        );

        userRepository.save(user);

        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}